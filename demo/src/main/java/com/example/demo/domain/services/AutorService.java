package com.example.demo.domain.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entities.Autor;
import com.example.demo.domain.entities.Comic;
import com.example.demo.infraestructure.autorRepository;


@Service
public class AutorService {

    @Autowired
    private autorRepository autorRepository;

    public Autor saveAutor(Autor autor){
        return autorRepository.save(autor);
    }

    public List<Autor> getAllAutors(){
        return autorRepository.findAll();
    }

    public Optional<Autor> getOneAutor(Long id){
        return autorRepository.findById(id);
    }

    //Para la lista de comics por autor:

    public Set<Comic> getComics(Long id){
       Optional<Autor> a1= autorRepository.findById(id);
       if(a1.isPresent()){
        return a1.get().getComics();
       }
       return Collections.emptySet();

    }

    





    
}
