package com.example.swplanetapi.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.repository.CrudRepository;
import com.example.swplanetapi.model.Planet;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;
import java.util.Optional;

public interface PlanetRepository extends CrudRepository<Planet, Long>, QueryByExampleExecutor<Planet> {

    Optional<Planet> findByName(String name);

    @Override
    <S extends Planet> List<S> findAll(Example<S> example);
}
