package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Humano {
    public String Nombre;
    public String Apellido;
    public ArrayList<Mascota> mascotas;

    public Humano (String nombre, String apellido, ArrayList<Mascota> unasMascotas){
        Nombre = nombre;
        Apellido = apellido;
        mascotas = unasMascotas;
    }

    public void AgregarMascota(Mascota unaMascota) {
        this.mascotas.add(unaMascota);
    }

    public void SaludarMascotas () {
        //JS let unaMascota of mascotas
        for (Mascota unaMascota:mascotas) {
            System.out.println("Te quiero: " + unaMascota.Nombre);
        }
    }
}