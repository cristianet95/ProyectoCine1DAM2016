/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Vista.Principal;
import controlador.Cine;
import java.util.Calendar;
import modelo.Pelicula;
import modelo.Sala;
import modelo.Sesion;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Jorge
 */
public class Main {
    public static void main(String[] args) {
        Principal p= new Principal();
        Cine c=new Cine("PUNT");
        //Base de datos
        /*Pelicula peli1 = new Pelicula("X-men apocalypse", "EEUU", 144, "Bryan Singer", "Jennifer Lawrence", "Magneto y Xavier se han separado 10 años después de Dias del futuro pasado y se reunirán para acabar con Apocalipsis", "Accion y superheroes", "B");
        Pelicula peli2 = new Pelicula("Civil war", "EEUU", 150, "Joe Russo, Anthony Russo", "Chris Evans, Robert Dawney jr", "Iron Man y el Capitan America estan enfrentados, la presion politica quiere controlar a Los Vengadores y cada uno tiene una opinion contraria, por lo que estalla una guerra civil entre ellos", "Accion y superheroes", "B");
        Pelicula peli3 = new Pelicula("Enemigo invisible", "EEUU", 102, "Gavin Hood", "Helen Miren", "Katherine Powell, una oficial de la inteligencia militar británica, lidera una operación secreta para capturar a un grupo de terroristas en Nairobi, Kenia. Cuando se da cuenta que los terroristas están en una misión suicida, ella debe cambiar sus planes de 'capturar' por 'matar'", "Thriller", "C");
        Pelicula peli4 = new Pelicula("Aterriza como puedas", "EEUU", 88, "David Zucker, Jerry Zucker, Jim Abrahams", "Leslie Nielsen, Robert Hays, Julie Hagerty, LLoyd Bridges, Peter Graves, Lorna Patterson", "El vuelo 209 de la Trans American sale de Los Ángeles con destino a Chicago. Entre el pasaje se encuentran una serie de curiosos personajes. Entre ellos, un ex-piloto de combate que, en pleno vuelo, se verá obligado a hacerse con el mando del avión comercial, tras quedar los pilotos indispuestos por una comida en mal estado", "Comedia", "Para todos los publicos");
        Pelicula peli5 = new Pelicula("El imperio contraataca", "EEUU", 124, "Irvin Kershner", "Mark Hamill, Harrison Ford, Carrie Fisher, Anthony Daniels, James Earl Jones, Kenny Baker", "La ficción se sitúa tres años después de la destrucción de la estación espacial de combate conocida como la Estrella de la muerte, destrucción acaecida al final del episodio anterior, Una Nueva Esperanza. En El Imperio Contraataca Luke Skywalker, Han Solo, Leia Organa y el resto de la Alianza Rebelde son perseguidos por Darth Vader y las fuerzas de élite del Imperio Galáctico", "Ciencia ficcion", "Para todos los publicos");
        Sala sala1 = new Sala(1, 15, 20, true);
        Sala sala2 = new Sala(2, 20, 30, false);
        Sala sala3 = new Sala(3, 40, 25, false);
        Sala sala4 = new Sala(4, 20, 40, true);
        Sala sala5 = new Sala(5, 10, 40, true);
        Calendar fecha1=Calendar.getInstance();
        fecha1.set(2016, 7, 15);
        Sesion sesion1 = new Sesion("m", fecha1, 9);
        sesion1.sala=sala1;
        fecha1.set(2016, 7, 16);        
        Sesion sesion2 = new Sesion("t", fecha1, 5);
        sesion2.sala=sala2;
        fecha1.set(2016, 8, 1);
        Sesion sesion3 = new Sesion("n", fecha1, 4);
        sesion3.sala=sala3;
        fecha1.set(2016, 8, 8);
        Sesion sesion4 = new Sesion("m", fecha1, 9);
        sesion4.sala=sala4;
        fecha1.set(2016, 8, 17);
        Sesion sesion5 = new Sesion("n", fecha1, 8);
        sesion5.sala=sala5;
        peli1.anadirSesion(sesion1);
        peli1.anadirSesion(sesion2);
        peli1.anadirSesion(sesion3);
        peli2.anadirSesion(sesion5);
        peli3.anadirSesion(sesion4);
        peli3.anadirSesion(sesion1);
        
        c.añadirPeli(peli1);
        c.añadirPeli(peli2);
        c.añadirPeli(peli3);
        c.añadirPeli(peli4);
        c.añadirPeli(peli5);
        
        
        c.añadirSala(sala1);
        c.añadirSala(sala2);
        c.añadirSala(sala3);
        c.añadirSala(sala4);
        c.añadirSala(sala5);
        
        c.guardarBD();
        c.guardarSalasBD();*/
        
        c.cargarPeliculas();
        c.cargarSalas();
        System.out.println(c.salas.size());
        System.out.println(c.peliculas.size());
    }
}
