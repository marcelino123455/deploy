package com.example.demo.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entities.Comentarios;
import com.example.demo.infraestructure.comentariosRepository;

@Service
public class comentarioService {

    @Autowired
    private comentariosRepository comentariosRepository;

    public Comentarios GenerarComentario(String content){
        Comentarios Ncoment = new Comentarios();
        Ncoment.setContenido(content);
        Ncoment.setLikes(0);
        Ncoment.setDislikes(0);
        return comentariosRepository.save(Ncoment);
    }
}
