
package com.company;

class Mascota {
    public String Nombre;
    public int Patas;
    public float Peso; //son gramos
    public int Velocidad;
    public Especie Tipo;

    public void agregarPatas(){
        Patas++;
    }
    public void atropellado(){
        Patas--;
    }
    public void comer(){
        Peso++;
    }
    public float correr(float unosKilometros){
        float tiempo = unosKilometros / Velocidad;
        Tipo.correr(unosKilometros, this);
        return tiempo;
    }
    public Mascota(String nombre, int patas, float peso, int velocidad, Especie tipo){
        Nombre = nombre;
        Patas = patas;
        Peso = peso;
        Velocidad = velocidad;
        Tipo = tipo;
    }
}
