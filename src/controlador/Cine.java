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
    File fichero;

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
        Iterator it = null;
        it = (Iterator) peliculas;
        actualizar(it);
    }

    public void eliminarPeli(Pelicula p) {
        peliculas.remove(p);
        Iterator it = null;
        it = (Iterator) peliculas;
        actualizar(it);
    }

    public void actualizar(Iterator it) {
        PrintWriter pwf = null;
        try {
            pwf = new PrintWriter(new FileOutputStream(fichero, true));
            while (it.hasNext()) {
                pwf.println(it.next().toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            pwf.close();
        }
    }

    public void mostrarFichero() {
        Scanner scf;
        try {
            scf = new Scanner(fichero);
            while (scf.hasNextLine()) {
                System.out.println(scf.nextLine());
            }
            scf.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
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
