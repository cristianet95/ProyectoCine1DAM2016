/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mati
 */
public class Sesion {
    private String nombre;
    private Date fecha;
    private double precio;
    ArrayList<Asiento> asientos;
    private Sala sala= null;
    
    public Sesion(String nombre, Date fecha, double precio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.asientos= new ArrayList<>();
    }

    public ArrayList<Asiento> getAsiento() {
        return asientos;
    }

    public void setAsiento(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
