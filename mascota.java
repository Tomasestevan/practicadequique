package com.company;

class Mascota {

    //atributos
    public String Nombre;
    public int Patas = 0;
    public int Peso = 0;
    public String Tipo;

    //metodos
    public void agregarPatas(){
        Patas++;
    }
    public void atropellado(){
        Patas--;
    }
    public void comer(){
        Peso++;
    }

    //constructor
    public Mascota(String nombre, int patas, int peso, String tipo){
        Nombre = nombre;
        Patas = patas;
        Peso = peso;
        Tipo = tipo;
    }
}




