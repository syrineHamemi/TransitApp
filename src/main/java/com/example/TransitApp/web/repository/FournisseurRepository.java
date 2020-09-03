package com.example.TransitApp.web.repository;

import com.example.TransitApp.web.model.Fournisseur;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class FournisseurRepository implements CrudRepository<Fournisseur, Integer> {
    @Override
    public <S extends Fournisseur> S save(S s) {
        return null;
    }

    @Override
    public <S extends Fournisseur> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Fournisseur> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Fournisseur> findAll() {
        return null;
    }

    @Override
    public Iterable<Fournisseur> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Fournisseur fournisseur) {

    }

    @Override
    public void deleteAll(Iterable<? extends Fournisseur> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
