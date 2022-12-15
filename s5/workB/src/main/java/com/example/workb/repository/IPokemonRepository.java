package com.example.workb.repository;

import com.example.workb.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPokemonRepository extends JpaRepository<Pokemon, Long> {
    // JPQL
    // @Query("SELECT p FROM Pokemon p WHERE p.number = :number")
    // SQL
    // @Query(value = "SELECT * FROM Pokemon WHERE number = :number", nativeQuery =
    // true)
    Optional<Pokemon> findOneByNumber(int number);
    // Named Queries
    // findByCampo1AndCampo2AndCampo3...
    // findOneByCampo1AndCampo2AndCampo3...
    // findByCampo1OrCampo2
}
