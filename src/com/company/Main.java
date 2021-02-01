package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
                                                                      //no importa que no diga tipo
        Mascota perro1;
        perro1 = new Mascota("Bobby", 4,40000, 10,new Perro());

        Mascota caballo1;
        caballo1 = new Mascota("Horsey",4,5000000, 100,new Caballo());

        Humano boludin1;
        boludin1 = new Humano("Chito","Vetromile",5,new Manicero());

        int cuantoQuedaDePene = boludin1.achicharrar(4);
        System.out.println("La Pija De Chito Ahora Mide " + cuantoQuedaDePene +"cm");


        //Tiempo de corrida lo defino acá para darle un significado al valor del perro.correr y poder acceder desde main
        //float tiempoDeCorrida = perro1.correr(10);
        //System.out.println("Tiempo: " + tiempoDeCorrida + " horas");
        //System.out.println("Peso despues: " + perro1.Peso + " gramos");


        //tiempoDeCorrida = caballo1.correr(100);
        //System.out.println("Tiempo: " + tiempoDeCorrida + " horas");
        //System.out.println("Peso despues: " + caballo1.Peso + " gramos");




        //ArrayList<Mascota> mascotasHomero = new ArrayList<Mascota>();
        //mascotasHomero.add(pez1);
        //mascotasHomero.add(new Mascota("Silver", 4,400, "Caballo"));

        //Humano homero;
        //homero = new Humano("homero", "simpson", mascotasHomero);

        //homero.AgregarMascota(perro1);
        //homero.SaludarMascotas();
    }
}
