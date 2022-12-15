package com.example.workb.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.workb.entity.Pokemon;
import com.example.workb.repository.IPokemonRepository;
import com.example.workb.service.IPokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonServiceImpl implements IPokemonService {

    private IPokemonRepository repository;

    @Autowired
    public PokemonServiceImpl(IPokemonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pokemon> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Pokemon> getOneByNumber(int number) {
        return repository.findOneByNumber(number);
    }

    @Override
    public Pokemon create(Pokemon data) {
        return repository.save(data);
    }
}
