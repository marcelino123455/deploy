package com.example.demo.infraestructure;
import com.example.demo.domain.entities.Comic;

import org.springframework.data.jpa.repository.JpaRepository;



public interface comicRepository extends JpaRepository<Comic, Long> {}

