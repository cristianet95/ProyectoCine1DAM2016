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
    public Sala sala = null;

    public Sesion(String nombre, Date fecha, double precio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.asientos = new ArrayList<>();
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "Nombre: " + this.nombre + "\nFecha: " + this.fecha.toString() + "\nPrecio: " + this.precio + "\nSala: " + this.sala.getNumero();
        return cadena;
    }

    public String mostrarSesionCompleta() {
        String cadena = "";
        cadena += "Nombre: " + this.nombre + "\nFecha: " + this.fecha.toString() + "\nPrecio: " + this.precio + "\nSala: " + this.sala.getNumero() + "\nDisponibilidad Asientos:\n-------------------------";
        for (Asiento a : asientos) {
            cadena += a.toString() + "\n";
        }
        return cadena;
    }

    public void modificarSesion(String nombre, Date fecha, double precio, Sala sala) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        }
        this.fecha = fecha;
        if (precio > -1) {
            this.precio = precio;
            if (sala != null) {
                this.sala = sala;
            }
        }
    }

    public void crearReserva(int fila, int num) {
        if (buscarAsiento(fila, num) != null) {
            Asiento a = buscarAsiento(fila, num);
            if (!confirmarReserva(a) && a.getDispo() != Disponibilidad.OCUPADO) {
                a.setDispo(Disponibilidad.RESERVADO);
            } else {
                System.out.println("El asiento no esta disponible");
            }
        } else {
            System.out.println("El asiento no existe");
        }
    }

    public void eliminarReserva(int fila, int num) {
        if (buscarAsiento(fila, num) != null) {
            Asiento a = buscarAsiento(fila, num);
            if (confirmarReserva(a)) {
                a.setDispo(Disponibilidad.LIBRE);
            } else {
                System.out.println("El asiento no esta reservado");
            }
        } else {
            System.out.println("El asiento no existe");
        }
    }

    public boolean confirmarReserva(Asiento a) {
        if (a.getDispo().equals(Disponibilidad.RESERVADO)) {
            return true;
        } else {
            return false;
        }
    }

    public Asiento buscarAsiento(int fila, int num) {
        for (Asiento a : asientos) {
            if (a.getFilaAsiento() == fila && a.getNumAsiento() == num) {
                return a;
            }
        }
        return null;
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
