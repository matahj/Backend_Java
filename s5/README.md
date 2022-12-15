# Conexión a bases de datos con Spring Data JPA.

### WorkA

Se crea un proyecto maven con las dependencias:
~~~
Spring Web
Spring JPA
MySQL Driver
~~~

El el archivo ./src/main/resources/application.properties se configura el acceso a la base de datos:
~~~
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/baseDeDatos    //la BD debe existir
spring.datasource.username=usr
spring.datasource.password=passworUSR
spring.jpa.hibernate.ddl-auto=update
~~~

En "model" se ponen las clases (POJOs) que serán mapeadas a tablas.
~~~
@Entity
@Table(name = "Personas")

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "nombre", nullable = false, length = 50)
~~~


En "controller" se gestionan las peticiones y se hace la inyección de dependencias (sesión anterior)
~~~
@RestController

@Autowired
@GetMapping("/getAll")
~~~


En "repository" se hace el acceso a la BD. Las interfaces "extends" de algún repositorio ("JpaRepository<Person,Long>") que ya tienen la implementación para algunas consultas.
~~~
@Repository
~~~


Se cra un Seeder para insertar datos, que se pueden ver en "localhost:8080/getAll". El Seeder es un componente que instancía a "IPersonRepository".
~~~
@Component
@Autowired
~~~


### WorkB

Se hace una API.

Iniciamos con las entidades en el "package entity":
~~~
@Entity
@Table(name = "trainers")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    //stters and getters
~~~

~~~
@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "number", nullable = false)
    private int number;

    //stters and getters
~~~

~~~
@Entity
@Table(name = "wild_pokemon")
public class WildPokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //de esta relación

    @Column(name = "level", nullable = false)
    private int level; //atributo de la relación

    //Foranea
    @ManyToOne
    @JoinColumn(name = "pokemon_id", referencedColumnName = "id", nullable = false)
    private Pokemon pokemon;

    //Foranea
    @ManyToOne
    @JoinColumn(name = "trainer_id", referencedColumnName = "id")
    private Trainer trainer;

    //setters and getters

~~~