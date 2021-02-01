package com.company;

//Especie caballo
public class Caballo implements Especie{
    public void comocorre(float unosKilometros, Mascota unCaballo){
        unCaballo.Peso = unCaballo.Peso + unosKilometros * 4;
    }
}
