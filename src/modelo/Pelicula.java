package modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mati
 */
public class Pelicula {

    private String titulo;
    private String nacionalidad;
    private int minutos;
    private String director;
    private String interprete;
    private String argumento;
    private String genero;
    private String clasificacion;
    public ArrayList<Sesion> sesiones;
    Pelicula activa = null;

    public Pelicula() {
        this.sesiones = new ArrayList<>();
    }

    public Pelicula(String titulo, String nacionalidad, int minutos, String director, String interprete, String argumento, String genero, String clasificacion) {
        this.titulo = titulo;
        this.nacionalidad = nacionalidad;
        this.minutos = minutos;
        this.director = director;
        this.interprete = interprete;
        this.argumento = argumento;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.sesiones = new ArrayList<>();
    }

    

    public void modificarPeli(String titulo, String nacionalidad, int minutos, String director, String interprete, String argumento, String genero, String clasificacion) {
        if (!titulo.isEmpty()) {
            this.titulo = titulo;
        }
        if (!nacionalidad.isEmpty()) {
            this.nacionalidad = nacionalidad;
        }
        if (minutos >= 1) {
            this.minutos = minutos;
        }
        if (!director.isEmpty()) {
            this.director = director;
        }
        if (!interprete.isEmpty()) {
            this.interprete = interprete;
        }
        if (!argumento.isEmpty()) {
            this.argumento = argumento;
        }
        if (!genero.isEmpty()) {
            this.genero = genero;
        }
        if (!clasificacion.isEmpty()) {
            this.clasificacion = clasificacion;
        }
    }
    @Override
    public String toString() {
        String cadena = "";
        cadena += this.titulo + "_" + this.nacionalidad + "_" + this.minutos + "_" + this.director + "_" + this.interprete + "_" + this.argumento + "_" + this.genero + "_" + this.clasificacion;
        for (Sesion s : sesiones) {
            cadena += "_";
            cadena+= s.toString();
        }
        return cadena;
    }
    public Pelicula crearPeliculaBD(String info){//metodo que usa el metodo de cine de guardar en un fichero
        String[] datosPeli=info.split("_");//0 es titulo, 1 es minutos,..del 8 al final son sesiones
        this.titulo = datosPeli[0];
        this.nacionalidad = datosPeli[1];
        this.minutos = Integer.parseInt(datosPeli[2]);
        this.director = datosPeli[3];
        this.interprete = datosPeli[4];
        this.argumento = datosPeli[5];
        this.genero = datosPeli[6];
        this.clasificacion = datosPeli[7];
        for (int i = 8; i < datosPeli.length; i++) {
            Sesion sesion=new Sesion();
            this.sesiones.add(sesion.crearSesionBD(datosPeli[i]));
        }
        return this;
    }

    public void anadirSesion(Sesion sesion) {
        this.sesiones.add(sesion);
    }

    public void eliminarSesion(String nombre, Calendar fecha) {
        for (Sesion s : this.sesiones) {
            if (s.getNombre().equals(nombre) && s.getFecha().get(Calendar.YEAR) == fecha.get(Calendar.YEAR) && s.getFecha().get(Calendar.MONTH) == fecha.get(Calendar.MONTH) && s.getFecha().get(Calendar.DATE) == fecha.get(Calendar.DATE)) {
                this.sesiones.remove(s);
            }
        }
    }
    
    public Sesion buscarSesion(String sesion) {
        for (int i = 0; i < this.sesiones.size() ; i++) {
            if(this.sesiones.get(i).getNombre().equals(sesion)){
                return this.sesiones.get(i);
            }
        }
        return null;
    }

    public ArrayList<Sesion> getListaSesion() {
        return this.sesiones;
    }

    public void setListaSesion(ArrayList<Sesion> sesiones) {
        this.sesiones = sesiones;
    }

    public String getTitutlo() {
        return titulo;
    }

    public void setTitutlo(String titulo) {
        this.titulo = titulo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public ArrayList<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(ArrayList<Sesion> sesiones) {
        this.sesiones = sesiones;
    }
    
}
