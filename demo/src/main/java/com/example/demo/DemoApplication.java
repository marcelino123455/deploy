package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.entities.Autor;
import com.example.demo.domain.entities.Comic;
import com.example.demo.infraestructure.autorRepository;
import com.example.demo.infraestructure.comicRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private autorRepository autorRepository;

	@Autowired
	private comicRepository comicRepository;

	@Override
	public void run(String... args) throws Exception {
		//Vamos a crear autores
		
		Autor a1 = new Autor();
		a1.setNombre("Emily Johnson");
		a1.setEditorial("DC Comics");

		Autor a2 = new Autor();
		a2.setNombre("David Lee");
		a2.setEditorial("Image Comics");

		Autor a3 = new Autor();
		a3.setNombre("Sarah Miller");
		a3.setEditorial("Dark Horse Comics");

		Autor a4 = new Autor();
		a4.setNombre("Michael Wilson");
		a4.setEditorial("IDW Publishing");

		Autor a5 = new Autor();
		a5.setNombre("Laura Davis");
		a5.setEditorial("Vertigo");

		Autor a6 = new Autor();
		a6.setNombre("Robert Martin");
		a6.setEditorial("Boom! Studios");

		Autor a7 = new Autor();
		a7.setNombre("Jennifer Clark");
		a7.setEditorial("Valiant Comics");

		Autor a8 = new Autor();
		a8.setNombre("Daniel White");
		a8.setEditorial("Top Cow Productions");

		Autor a9 = new Autor();
		a9.setNombre("Susan Taylor");
		a9.setEditorial("Archie Comics");

		autorRepository.save(a1);		
		autorRepository.save(a2);
		autorRepository.save(a3);
		autorRepository.save(a4);
		autorRepository.save(a5);
		autorRepository.save(a6);
		autorRepository.save(a7);
		autorRepository.save(a8);
		autorRepository.save(a9);

		//Autores creados

		//Creamos comics

		Comic c1 = new Comic();
		c1.setAutor(a1);
		c1.setEstado("En stock");
		c1.setDislikes(3);
		c1.setNombre("Wonder Woman: Rebirth");
		c1.setFecha_de_publicación("05-11-2023");
		c1.setLikes(10);
		c1.setPrecio(30);
		List<String> l1= new ArrayList<>();
		l1.add("comic1");
		c1.setImagenes_description(l1);
		c1.setAutor(a1);
		comicRepository.save(c1);

		Comic c2 = new Comic();
		c2.setAutor(a1);
		c2.setEstado("En stock");
		c2.setDislikes(3);
		c2.setNombre("Superman: Earth One");
		c2.setFecha_de_publicación("05-11-2023");
		c2.setLikes(10);
		c2.setPrecio(30);
		List<String> l2= new ArrayList<>();
		l2.add("comic2");
		c2.setImagenes_description(l2);
		comicRepository.save(c2);

		Comic c3 = new Comic();
		c3.setAutor(a2);
		c3.setEstado("En stock");
		c3.setDislikes(3);
		c3.setNombre("The Walking Dead");
		c3.setFecha_de_publicación("05-11-3033");
		c3.setLikes(10);
		c3.setPrecio(30);
		List<String> l3= new ArrayList<>();
		l3.add("comic3");
		c3.setImagenes_description(l3);
		comicRepository.save(c3);

		Comic c4 = new Comic();
		c4.setAutor(a2);
		c4.setEstado("En stock");
		c4.setDislikes(4);
		c4.setNombre("Invincible");
		c4.setFecha_de_publicación("05-11-4044");
		c4.setLikes(10);
		c4.setPrecio(40);
		List<String> l4= new ArrayList<>();
		l4.add("comic4");
		c4.setImagenes_description(l4);
		comicRepository.save(c4);

		Comic c5 = new Comic();
		c5.setAutor(a3);
		c5.setEstado("En stock");
		c5.setDislikes(5);
		c5.setNombre("Buffy the Vampire Slayer Season 8" );
		c5.setFecha_de_publicación("05-11-5055");
		c5.setLikes(10);
		c5.setPrecio(50);
		List<String> l5= new ArrayList<>();
		l5.add("comic5");
		c5.setImagenes_description(l5);
		comicRepository.save(c5);

		Comic c6 = new Comic();
		c6.setAutor(a3);
		c6.setEstado("En stock");
		c6.setDislikes(6);
		c6.setNombre("Hellboy");
		c6.setFecha_de_publicación("06-11-6066");
		c6.setLikes(10);
		c6.setPrecio(60);
		List<String> l6= new ArrayList<>();
		l6.add("comic6");
		c6.setImagenes_description(l6);
		comicRepository.save(c6);

		Comic c7 = new Comic();
		c7.setAutor(a4);
		c7.setEstado("En stock");
		c7.setDislikes(7);
		c7.setNombre("Teenage Mutant Ninja Turtles");
		c7.setFecha_de_publicación("07-11-7077");
		c7.setLikes(10);
		c7.setPrecio(70);
		List<String> l7= new ArrayList<>();
		l7.add("comic7");
		c7.setImagenes_description(l7);
		comicRepository.save(c7);

		Comic c8 = new Comic();
		c8.setAutor(a4);
		c8.setEstado("En stock");
		c8.setDislikes(8);
		c8.setNombre("Locke & Key");
		c8.setFecha_de_publicación("08-11-8088");
		c8.setLikes(10);
		c8.setPrecio(80);
		List<String> l8= new ArrayList<>();
		l8.add("comic8");
		c8.setImagenes_description(l8);
		comicRepository.save(c8);

		Comic c9 = new Comic();
		c9.setAutor(a5);
		c9.setEstado("En stock");
		c9.setDislikes(9);
		c9.setNombre("The Sandman");
		c9.setFecha_de_publicación("09-11-9099");
		c9.setLikes(10);
		c9.setPrecio(90);
		List<String> l9= new ArrayList<>();
		l9.add("comic9");
		c9.setImagenes_description(l9);
		comicRepository.save(c9);

		Comic c10 = new Comic();
		c10.setAutor(a5);
		c10.setEstado("En stock");
		c10.setDislikes(10);
		c10.setNombre("Y: The Last Man");
		c10.setFecha_de_publicación("010-11-1010");
		c10.setLikes(10);
		c10.setPrecio(100);
		List<String> l10= new ArrayList<>();
		l10.add("comic10");
		c10.setImagenes_description(l10);
		comicRepository.save(c10);

		Comic c11 = new Comic();
		c11.setAutor(a6);
		c11.setEstado("En stock");
		c11.setDislikes(11);
		c11.setNombre("Mouse Guard");
		c11.setFecha_de_publicación("011-11-1111");
		c11.setLikes(11);
		c11.setPrecio(110);
		List<String> l11= new ArrayList<>();
		l11.add("comic11");
		c11.setImagenes_description(l11);
		comicRepository.save(c11);

		Comic c12 = new Comic();
		c12.setAutor(a6);
		c12.setEstado("En stock");
		c12.setDislikes(12);
		c12.setNombre("Irredeemable");
		c12.setFecha_de_publicación("012-12-1212");
		c12.setLikes(12);
		c12.setPrecio(120);
		List<String> l12= new ArrayList<>();
		l12.add("comic12");
		c12.setImagenes_description(l12);
		comicRepository.save(c12);

		Comic c13 = new Comic();
		c13.setAutor(a7);
		c13.setEstado("En stock");
		c13.setDislikes(13);
		c13.setNombre("Harbinger");
		c13.setFecha_de_publicación("013-13-1313");
		c13.setLikes(13);
		c13.setPrecio(130);
		List<String> l13= new ArrayList<>();
		l13.add("comic13");
		c13.setImagenes_description(l13);
		comicRepository.save(c13);

		Comic c14 = new Comic();
		c14.setAutor(a7);
		c14.setEstado("En stock");
		c14.setDislikes(14);
		c14.setNombre("Bloodshot");
		c14.setFecha_de_publicación("014-14-1414");
		c14.setLikes(14);
		c14.setPrecio(140);
		List<String> l14= new ArrayList<>();
		l14.add("comic14");
		c14.setImagenes_description(l14);
		comicRepository.save(c14);

		Comic c15 = new Comic();
		c15.setAutor(a8);
		c15.setEstado("En stock");
		c15.setDislikes(15);
		c15.setNombre("Witchblade");
		c15.setFecha_de_publicación("015-15-1501");
		c15.setLikes(15);
		c15.setPrecio(150);
		List<String> l15= new ArrayList<>();
		l15.add("comic15");
		c15.setImagenes_description(l15);
		comicRepository.save(c15);

		Comic c16 = new Comic();
		c16.setAutor(a8);
		c16.setEstado("En stock");
		c16.setDislikes(16);
		c16.setNombre("The Darkness");
		c16.setFecha_de_publicación("016-16-1011");
		c16.setLikes(16);
		c16.setPrecio(160);
		List<String> l16= new ArrayList<>();
		l16.add("comic16");
		c16.setImagenes_description(l16);
		comicRepository.save(c16);
	
		Comic c17 = new Comic();
		c17.setAutor(a9);
		c17.setEstado("En stock");
		c17.setDislikes(17);
		c17.setNombre("Archie");
		c17.setFecha_de_publicación("017-17-1701");
		c17.setLikes(17);
		c17.setPrecio(170);
		List<String> l17= new ArrayList<>();
		l17.add("comic17");
		c17.setImagenes_description(l17);
		comicRepository.save(c17);

		Comic c18 = new Comic();
		c18.setAutor(a9);
		c18.setEstado("En stock");
		c18.setDislikes(18);
		c18.setNombre("Betty and Veronica");
		c18.setFecha_de_publicación("018-18-1811");
		c18.setLikes(18);
		c18.setPrecio(180);
		List<String> l18= new ArrayList<>();
		l18.add("comic18");
		c18.setImagenes_description(l18);
		comicRepository.save(c18);
		

	}

}
