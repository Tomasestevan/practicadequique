package com.company;

//Especie perro
public class Perro implements Especie {
    public void comocorre(float unosKilometros, Mascota unPerro){

        unPerro.Peso = unPerro.Peso - unosKilometros * 10;
    }




}
