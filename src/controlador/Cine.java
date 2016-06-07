/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import modelo.Pelicula;

/**
 *
 * @author mati
 */
public class Cine {

    private String nombre;
    ArrayList<Pelicula> peliculas;

    public Cine(String nombre) {
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();
    }

    public Pelicula buscarPeli(String titulo) {
        for (Pelicula p : this.peliculas) {
            if (p.getTitutlo().equals(titulo)) {
                return p;
            }
        }
        return null;
    }

    public void añadirPeli(Pelicula p) {
        peliculas.add(p);
        
    }

    public void eliminarPeli(Pelicula p) {
        peliculas.remove(p);
        
    }

    

     public void guardarBD() {
        Iterator it = (Iterator)this.peliculas;
        PrintWriter pwf = null;
        try {
            pwf = new PrintWriter(new FileOutputStream("bd.txt"));
            while (it.hasNext()) {
                pwf.println(it.next().toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            pwf.close();
        }
    }
    

    public void cargarPeliculas() {
        Scanner scf;
        Pelicula peli=null;
        String[] datosPeli;
        scf = new Scanner("bd.txt");
        while(scf.hasNextLine()){
            datosPeli=scf.nextLine().split(";");
            for (int i = 0; i < datosPeli.length; i++) {
                peli.crearPeliculaBD(datosPeli[i]);
                this.peliculas.add(peli);
            }
        }
        scf.close();
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
