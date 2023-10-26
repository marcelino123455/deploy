package com.example.demo.domain.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entities.Autor;
import com.example.demo.domain.entities.Comentarios;
import com.example.demo.domain.entities.Comic;
import com.example.demo.domain.entities.Usuario;
import com.example.demo.domain.entities.Venta;
import com.example.demo.infraestructure.autorRepository;
import com.example.demo.infraestructure.comentariosRepository;
import com.example.demo.infraestructure.comicRepository;
import com.example.demo.infraestructure.usuarioRepository;
import com.example.demo.infraestructure.ventaRepository;

@Service
public class comicService {
    @Autowired
    private comicRepository comicRepository;
    @Autowired
    private ventaRepository ventaRepository;
    @Autowired
    private comentariosRepository comentariosRepository;
    @Autowired
    private usuarioRepository usuarioRepository;
    @Autowired
    private autorRepository autorRepository;

    public Comic GuardarComic(Comic comic){
        Autor CAutor = comic.getAutor();
        Autor SAutor = autorRepository.save(CAutor);
        Comic SComic = comicRepository.save(comic);
        SComic.setAutor(SAutor);
        Set<Comic> AComics = SAutor.getComics();
        AComics.add(SComic);
        SAutor.setComics(AComics);
        autorRepository.save(SAutor);
        return comicRepository.save(SComic);
    }
    public List<Comic> GuardarPostComic(List<Comic> comics, Usuario user){
        List<Comic> NComics = new ArrayList<>();
        for(Comic crearComic: comics){
            NComics.add(comicRepository.save(crearComic));
        }
        Usuario AUser = usuarioRepository.findById(user.getId()).get();
        AUser.setComic_posteado(NComics);
        Usuario Nuser = usuarioRepository.save(AUser);
        for(Comic OComic: comics){
            OComic.setUser(Nuser);
            comicRepository.save(OComic);
        }

        return NComics;
    }
    public Venta GenerarCompra(List <Comic> comics){
        Venta Rventa = new Venta();
        Set<Comic> tempc = new HashSet<>(comics);
        Rventa.setComics(tempc);
        Rventa.setEstado("0");
        Integer Ptotal = 0;
        for(Comic Vcomic: comics){
            Ptotal += Vcomic.getPrecio();
        }
        Rventa.setPrecio_total(Ptotal);
        Rventa.setCosto_de_envio(0.1 * Ptotal);
        return ventaRepository.save(Rventa);
    }

    public void RegistrarComentario(Long comicId, Long comentarioId){
        Comic NComic = comicRepository.findById(comicId).get();
        Comentarios NComent = comentariosRepository.findById(comentarioId).get();
        Set<Comentarios> LComents = NComic.getComentarios();
        LComents.add(NComent);
        NComic.setComentarios(LComents);
        comicRepository.save(NComic);
    }

    public void ActualizarLikesComentario(Long comentarioId){
        Comentarios coment = comentariosRepository.findById(comentarioId).get();
        coment.setLikes(coment.getLikes() + 1);
    }
    public void ActualizarDisLikesComentario(Long comentarioId){
        Comentarios coment = comentariosRepository.findById(comentarioId).get();
        coment.setDislikes(coment.getDislikes() + 1);
    }
    public void ActializarLikesComic(Long comicId){
        Comic comic= comicRepository.findById(comicId).get();
        comic.setLikes(comic.getLikes() + 1);
    }
    public void ActializarDisLikesComic(Long comicId){
        Comic comic= comicRepository.findById(comicId).get();
        comic.setDislikes(comic.getDislikes() + 1);
    }
}