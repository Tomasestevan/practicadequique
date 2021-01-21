package com.company;

class Mascota {
    public String Nombre;
    public int Patas = 0;
    public int Peso = 0;
    public String Tipo;

    public void agregarPatas(){
        Patas++;
    }
    public void atropellado(){
        Patas--;
    }
    public void comer(){
        Peso++;
    }
    public Mascota(String nombre, int patas, int peso, String tipo){
        Nombre = nombre;
        Patas = patas;
        Peso = peso;
        Tipo = tipo;
    }
}




