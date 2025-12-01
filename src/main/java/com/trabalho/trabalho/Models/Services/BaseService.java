package com.trabalho.trabalho.Models.Services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class BaseService<E, Repository extends JpaRepository<E, Long>>{

    protected Repository repository;

    public BaseService(Repository repository) {
        this.repository = repository;
    }

    public E find(Long id){
        return repository.findById(id).get();
    };

    public List<E> all(){
        return this.repository.findAll();
    }

    public void delete(Long id){
        this.repository.deleteById(id);
    }

    public void create(E entity){
        repository.save(entity);
    }

    // so para o controller parar de reclamar
    public void save(E entity){}

}
