package com.example.workb.service;

import java.util.List;
import java.util.Optional;

import com.example.workb.entity.Pokemon;

public interface IPokemonService {

    List<Pokemon> getAll();

    Optional<Pokemon> getOneByNumber(int number);

    Pokemon create(Pokemon data);
}