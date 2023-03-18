package com.example.swplanetapi.service;

import com.example.swplanetapi.core.builder.QueryBuilder;
import com.example.swplanetapi.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.swplanetapi.model.Planet;

import java.util.List;
import java.util.Optional;

@Service
public class PlanetService {

    private PlanetRepository repository;

    @Autowired
    public PlanetService(PlanetRepository repository) {
        this.repository = repository;
    }

    public Planet create(Planet planet) {
        return repository.save(planet);
    }

    public Optional<Planet> getById(Long id) {
        return repository.findById(id);
    }

    public Optional<Planet> getByName(String name) {
        return repository.findByName(name);
    }

    public List<Planet> list(String terrain, String climate) {
        Example<Planet> query = QueryBuilder.makeQuery(new Planet(climate, terrain));
        return repository.findAll(query);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }
}
