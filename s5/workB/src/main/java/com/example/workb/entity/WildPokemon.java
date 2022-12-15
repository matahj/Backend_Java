package com.example.workb.entity;

import jakarta.persistence.*;

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

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
