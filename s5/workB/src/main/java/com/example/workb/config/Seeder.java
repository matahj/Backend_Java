package com.example.workb.config;

import com.example.workb.repository.IPokemonRepository;
import com.example.workb.repository.ITrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

import com.example.workb.entity.Pokemon;
import com.example.workb.entity.Trainer;

@Component
public class Seeder implements CommandLineRunner {

    private IPokemonRepository pokemonRepository;
    private ITrainerRepository trainerRepository;

    @Autowired
    public Seeder(IPokemonRepository pokemonRepository, ITrainerRepository trainerRepository) {
        this.pokemonRepository = pokemonRepository;
        this.trainerRepository = trainerRepository;
    }

    @Override
    public void run(String[] args) {
        Optional<Pokemon> pikachu = pokemonRepository.findOneByNumber(25);

        if (pikachu.isEmpty()) {
            Pokemon p = new Pokemon();
            p.setName("Pikachu");
            p.setNumber(25);

            pokemonRepository.save(p);
        }

        Trainer ash = trainerRepository.findOneByName("Ash Ketchup");

        if (ash == null) {
            Trainer t = new Trainer();
            t.setName("Ash Ketchup");

            trainerRepository.save(t);
        }
    }
}
