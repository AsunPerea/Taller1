package com.company;


public class Cinema {

    private String nom;
    private int numSalas;
    private Pelicula peliculas[];

    public Cinema(){

    }

    public void peliculaMesLlarga(){

        Pelicula mayor = peliculas[0];

        for(int i = 0; i < peliculas.length; i++){


            if(Pelicula.getDuracio(peliculas[i]) > mayor) {

                mayor = peliculas[i];

            }

        }

        System.out.println("La pelicula mayor es: " + mayor);


    }


}
