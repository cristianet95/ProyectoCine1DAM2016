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
    static ArrayList<Pelicula> peliculas= new ArrayList<>();

    public Cine(String nombre) {
        this.nombre = nombre;
    }

    public static Pelicula buscarPeli(String titulo) {
        for (int i = 0; i < peliculas.size(); i++) {
            if(peliculas.get(i).getTitutlo().equals(titulo)){
                return peliculas.get(i);
            }
        }
        return null;
    }

    public static void añadirPeli(Pelicula p) {
        peliculas.add(p);
        
    }

    public static void eliminarPeli(Pelicula p) {
        peliculas.remove(p);
        
    }

    /*guarda todo el Arraylist pelis dentro de un fichero en el proyecto*/
     public void guardarBD() {
        Iterator it = this.peliculas.iterator();
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
    
     /*Carga todas las peliculas desde el fichero hasta el ArrayList*/
    public void cargarPeliculas() {
        Scanner scf;
        Pelicula peli=null;
        String[] datosPeli;
        try {
            scf = new Scanner(new File("bd.txt"));
            while(scf.hasNextLine()){
                datosPeli=scf.nextLine().split(";");
                for (int i = 0; i < datosPeli.length; i++) {
                    peli=new Pelicula();
                    peli.crearPeliculaBD(datosPeli[i]);
                    this.peliculas.add(peli);
                }
                scf.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }

    public static ArrayList<Pelicula> getPeliculas() {
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
