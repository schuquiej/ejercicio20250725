/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20250725;

import clases.*;

import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public class Ejercicio20250725 {

    public static void main(String[] args) {


        ArrayList<Mascota> mascotas = new ArrayList<>();

        mascotas.add(new Perro());
        mascotas.add(new Gato());
        mascotas.add(new Conejo());
        mascotas.add(new Tortuga());

        for (Mascota mascota : mascotas) {
            mascota.hacerSonido();
            mascota.descansar();

            if (mascota instanceof AtencionEspecial) {
                AtencionEspecial especial = (AtencionEspecial) mascota;
                especial.recibirAtencionEspecial();
            }

            if (mascota instanceof Vacunable) {
                Vacunable vac = (Vacunable) mascota;
                vac.vacunar();
            }

            System.out.println("------------------------");
        }



    }
}
