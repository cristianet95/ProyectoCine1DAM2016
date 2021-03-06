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
import modelo.Sala;

/**
 *
 * @author mati
 */
public class Cine {

    private String nombre;
    public static ArrayList<Pelicula> peliculas= new ArrayList<>();
    public static ArrayList<Sala> salas = new ArrayList<>();

    public Cine(){}
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

    public static Sala buscarSala(int numero) {
        for (int i = 0; i < salas.size(); i++) {
            if(salas.get(i).getNumero()==numero){
                return salas.get(i);
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
    public static void añadirSala(Sala s) {
        salas.add(s);
        
    }

    public static void eliminarSala(Sala s) {
        salas.remove(s);
        
    }

    /*guarda todo el Arraylist pelis dentro de un fichero en el proyecto*/
     public static void exportarBD() {
        Iterator it = peliculas.iterator();
        PrintWriter pwf = null;
        try {
            pwf = new PrintWriter(new File("bd.txt"));
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
    public static void importarPeliculas() {
        Scanner scf;
        Pelicula peli=null;
        String[] datosPeli;
        try {
            scf = new Scanner(new File("bd.txt"));
            while(scf.hasNextLine()){
                peli=new Pelicula();
                peli.crearPeliculaBD(scf.nextLine());
                peliculas.add(peli);
            }
            scf.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    /*guarda todo el Arraylist salas dentro de un fichero en el proyecto*/
     public static void exportarSalasBD() {
        Iterator it = salas.iterator();
        PrintWriter pwf = null;
        try {
            pwf = new PrintWriter(new File("bdSalas.txt"));
            while (it.hasNext()) {
                pwf.println(it.next().toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            pwf.close();
        }
    }
    
     /*Carga todas las salas desde el fichero hasta el ArrayList*/
    public static void importarSalas() {
        Scanner scf;
        Sala sala=null;
        String[] datosSala;
        try {
            scf = new Scanner(new File("bdSalas.txt"));
            while(scf.hasNextLine()){
                sala=new Sala();
                sala.crearSalaBD(scf.nextLine());
                salas.add(sala);
            }
            scf.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }

    public static ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public static void setPeliculas(ArrayList<Pelicula> peliculasL) {
        peliculas = peliculasL;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
