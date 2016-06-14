/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author mati
 */
public class Sesion {

    private String nombre;
    private Calendar fecha;
    private double precio;
    public ArrayList<Asiento> asientos;
    public Sala sala = null;
    
    public Sesion(){
        this.fecha=Calendar.getInstance();
        this.asientos=new ArrayList();
        
    }

    public Sesion(String nombre, Calendar fecha, double precio, Sala sala) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.sala=sala;
        this.asientos = new ArrayList<>();
        cargarAsientos();
    }
    
    public void cargarAsientos(){
        for (int i = 0; i < this.sala.getFilas(); i++) {
            for (int j = 0; j < this.sala.getTamFila(); j++) {
                this.asientos.add( new Asiento(i,j,Disponibilidad.LIBRE) );
            }
        }
    }

    @Override
    public String toString(){
        String cadena="";
        cadena+=this.nombre+"-"+this.fecha.get(Calendar.MONTH)+"-"+this.fecha.get(Calendar.DATE)+"-"+this.fecha.get(Calendar.YEAR)+"-"+this.precio+"-"+this.sala.getNumero()+"-"+this.sala.getFilas()+"-"+this.sala.getTamFila()+"-"+this.sala.isSala3d();
        return cadena;
    }
    public Sesion crearSesionBD(String info){//este metodo lo usa Cine solamente
        String[] datosSesion=info.split("-");
        this.nombre = datosSesion[0];
        int mes=Integer.parseInt(datosSesion[1]);
        int dia=Integer.parseInt(datosSesion[2]);
        int año=Integer.parseInt(datosSesion[3]);
        this.fecha.set(año, mes, dia, 0, 0, 0);
        this.precio = Double.parseDouble(datosSesion[4]);
        this.sala=new Sala();
        this.sala.setNumero(Integer.parseInt(datosSesion[5]));
        this.sala.setFilas(Integer.parseInt(datosSesion[6]));
        this.sala.setTamFila(Integer.parseInt(datosSesion[7]));
        boolean sala3d=false;
        if(datosSesion[8].equals("true"))
            sala3d=true;
        this.sala.setSala3d(sala3d);
        
        return this;
    }

    public String mostrarSesionCompleta() {
        String cadena = "";
        cadena += "Nombre: " + this.nombre + "\nFecha: " + this.fecha.toString() + "\nPrecio: " + this.precio + "\nSala: " + this.sala.getNumero() + "\nDisponibilidad Asientos:\n-------------------------";
        for (Asiento a : asientos) {
            cadena += a.toString() + "\n";
        }
        return cadena;
    }

    public void modificarSesion(String nombre, Calendar fecha, double precio, Sala sala) {
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
            if (!confirmarReserva(a)) {
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
        if (a.getDispo().equals(Disponibilidad.OCUPADO)) {
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

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
