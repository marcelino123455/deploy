package com.example.demo.infraestructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entities.Usuario;
import java.util.Optional;


public interface usuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNombre(String nombre);
}


