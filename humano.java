package com.company;
 import java.util.List;
public class humano {
    //atributos
    public String Nombre;
    public String Apellido;
    public List<Mascota> mascotas;


    //metodo
    public void agregarMascota (Mascota nuevaMascota){

    };

    //constructor
    public humano (String nombre, String apellido,List<Mascota> unasMascotas){
        Nombre = nombre;
        Apellido = apellido;
        mascotas = unasMascotas;
    }



}
