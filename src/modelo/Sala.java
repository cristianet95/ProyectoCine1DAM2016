/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mati
 */
public class Sala {

    private int numero;
    private int filas;
    private int tamFila;
    private boolean sala3d;
    
    public Sala(){}

    public Sala(int numero, int filas, int tamFila, boolean sala3d) {
        this.numero = numero;
        this.filas = filas;
        this.tamFila = tamFila;
        this.sala3d = sala3d;
    }

    @Override
    public String toString() {
        return this.numero + ";" + this.filas + ";" + this.tamFila + ";" + this.sala3d;
    }

    public void modificarSala(int numero, int filas, int tamFila, boolean sala3d) {
        if (numero > 0) {
            this.numero = numero;
        }
        if (filas > -1) {
            this.filas = filas;
        }
        if (tamFila > -1) {
            this.tamFila = tamFila;
        }
        this.sala3d = sala3d;
    }
    public Sala crearSalaBD(String info){//metodo que usa el metodo de cine de guardar en un fichero
        String[] datosSala=info.split(";");//0 es titulo, 1 es minutos,..del 8 al final son sesiones
        this.numero = Integer.parseInt(datosSala[0]);
        this.filas = Integer.parseInt(datosSala[1]);
        this.tamFila = Integer.parseInt(datosSala[2]);
        boolean sala3d=false;
        if(datosSala[3].equals("true"))
            sala3d=true;
        this.sala3d=sala3d;
        return this;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getTamFila() {
        return tamFila;
    }

    public void setTamFila(int tamFila) {
        this.tamFila = tamFila;
    }

    public boolean isSala3d() {
        return sala3d;
    }

    public void setSala3d(boolean sala3d) {
        this.sala3d = sala3d;
    }
    
    
}
