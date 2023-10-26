package com.example.demo.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entities.Usuario;
import com.example.demo.infraestructure.usuarioRepository;

@Service
public class usuarioService {
    @Autowired
    private usuarioRepository usuarioRepository;

    public Usuario GenerarNuevoUsuario(Usuario user){
        return usuarioRepository.save(user);
    }

}