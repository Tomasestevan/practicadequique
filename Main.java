package com.company;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
	Mascota caballo1;
	caballo1 = new Mascota("Silver", 4,400, "Caballo");

	Mascota perro1;
	perro1 = new Mascota("Bobby", 4,40,"Perro");

	Mascota pez1;
	pez1 = new Mascota("Alberto",0,5,"Pez");

	Mascota perro2;
	perro2 = new Mascota("Ayudante De Santa",4,35,"Perro");

	Mascota gato1;
	gato1 = new Mascota("Bola De Nieve 2",4,20,"Gato");

	List<Mascota> mascotasDeHumano = new ArrayList<Mascota>();
	mascotasDeHumano.add(perro2);
	mascotasDeHumano.add(gato1);

	humano homero;
	homero = new humano("Homero","Simpson",mascotasDeHumano);

    }



    }




