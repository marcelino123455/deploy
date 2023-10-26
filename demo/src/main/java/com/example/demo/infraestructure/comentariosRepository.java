package com.example.demo.infraestructure;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entities.Comentarios;



public interface comentariosRepository extends JpaRepository<Comentarios, Long> {}

