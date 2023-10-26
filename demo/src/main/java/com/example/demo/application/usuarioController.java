package com.example.demo.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.DTOs.NewComentarioDTO;
import com.example.demo.domain.DTOs.NewPostComicDTO;
import com.example.demo.domain.entities.Comentarios;
import com.example.demo.domain.entities.Comic;
import com.example.demo.domain.services.comentarioService;
import com.example.demo.domain.services.comicService;

@RestController
@RequestMapping("/user")
public class usuarioController {
    @Autowired
    private comicService comicService;

    @Autowired
    private comentarioService comentarioService;

    @PostMapping("/registrar_comentario")
    public ResponseEntity<String> HacerComentario(@RequestBody NewComentarioDTO coment){
        Comentarios Ncomentario = comentarioService.GenerarComentario(coment.getContent());
        comicService.RegistrarComentario(coment.getUsuario().getId(), Ncomentario.getId());
        return new ResponseEntity<>("Nuevo comentario !", HttpStatus.CREATED);
    }

    @PostMapping("/postear_comics")
    public ResponseEntity<List<Comic>> PostearComic(@RequestBody NewPostComicDTO NewComic){
        return new ResponseEntity<>(comicService.GuardarPostComic(NewComic.getComic(), NewComic.getUsuario()), HttpStatus.CREATED);
    }


}

