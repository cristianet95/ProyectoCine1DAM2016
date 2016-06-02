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
public class Asiento {
    private int filaAsiento;
    private int numAsiento;
    private Disponibilidad dispo;

    public Asiento(int filaAsiento, int numAsiento, Disponibilidad dispo) {
        this.filaAsiento = filaAsiento;
        this.numAsiento = numAsiento;
        this.dispo = dispo;
    }
    
    @Override
    public String toString(){
        String cadena="";
        cadena+="NºFila: "+this.filaAsiento+"\nNºAsiento: "+this.numAsiento+"\nDisponibilidad: "+this.dispo;
        return cadena;
    }
    public int getFilaAsiento() {
        return filaAsiento;
    }

    public void setFilaAsiento(int filaAsiento) {
        this.filaAsiento = filaAsiento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public Disponibilidad getDispo() {
        return dispo;
    }

    public void setDispo(Disponibilidad dispo) {
        this.dispo = dispo;
    }
}
