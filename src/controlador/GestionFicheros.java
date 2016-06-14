/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Calendar;
import modelo.*;

/**
 *
 * @author usuario
 */
public class GestionFicheros {
    
    

    public GestionFicheros() {
        
    }
    /*Carga la bd con peliculas y sesiones solo se debe si quieres cargar tu bd con algo para pruebas*/
    
    public void importarBDInicial(){
        Sala sala1 = new Sala(1, 9, 9, true);
        Sala sala2 = new Sala(2, 8, 8, false);
        Sala sala3 = new Sala(3, 6, 6, false);
        Sala sala4 = new Sala(4, 4, 4, true);
        Sala sala5 = new Sala(5, 5, 7, true);
        Calendar fecha1=Calendar.getInstance();
        fecha1.set(2016, 7, 15, 0, 0, 0);
        Sesion sesion1 = new Sesion("m", fecha1, 9, sala1);
        fecha1.set(2016, 7, 16, 0, 0, 0);        
        Sesion sesion2 = new Sesion("t", fecha1, 5, sala2);
        fecha1.set(2016, 8, 1, 0, 0, 0);
        Sesion sesion3 = new Sesion("n", fecha1, 4, sala3);
        fecha1.set(2016, 8, 8, 0, 0, 0);
        Sesion sesion4 = new Sesion("m", fecha1, 9, sala4);
        fecha1.set(2016, 8, 17, 0, 0, 0);
        Sesion sesion5 = new Sesion("n", fecha1, 8, sala5);
        
        Pelicula peli1 = new Pelicula("X-men apocalypse", "EEUU", 144, "Bryan Singer", "Jennifer Lawrence", "Magneto y Xavier se han separado 10 años después de Dias del futuro pasado y se reunirán para acabar con Apocalipsis", "Accion y superheroes", "B");
        peli1.anadirSesion(sesion1);
        peli1.anadirSesion(sesion2);
        peli1.anadirSesion(sesion3);
        controlador.Cine.añadirPeli(peli1);
        Pelicula peli2 = new Pelicula("Civil war", "EEUU", 150, "Joe Russo, Anthony Russo", "Chris Evans, Robert Dawney jr", "Iron Man y el Capitan America estan enfrentados, la presion politica quiere controlar a Los Vengadores y cada uno tiene una opinion contraria, por lo que estalla una guerra civil entre ellos", "Accion y superheroes", "B");
        peli2.anadirSesion(sesion5);
        controlador.Cine.añadirPeli(peli2);
        Pelicula peli3 = new Pelicula("Enemigo invisible", "EEUU", 102, "Gavin Hood", "Helen Miren", "Katherine Powell, una oficial de la inteligencia militar británica, lidera una operación secreta para capturar a un grupo de terroristas en Nairobi, Kenia. Cuando se da cuenta que los terroristas están en una misión suicida, ella debe cambiar sus planes de 'capturar' por 'matar'", "Thriller", "C");
        peli3.anadirSesion(sesion4);
        peli3.anadirSesion(sesion1);
        controlador.Cine.añadirPeli(peli3);
        Pelicula peli4 = new Pelicula("Aterriza como puedas", "EEUU", 88, "David Zucker, Jerry Zucker, Jim Abrahams", "Leslie Nielsen, Robert Hays, Julie Hagerty, LLoyd Bridges, Peter Graves, Lorna Patterson", "El vuelo 209 de la Trans American sale de Los Ángeles con destino a Chicago. Entre el pasaje se encuentran una serie de curiosos personajes. Entre ellos, un ex-piloto de combate que, en pleno vuelo, se verá obligado a hacerse con el mando del avión comercial, tras quedar los pilotos indispuestos por una comida en mal estado", "Comedia", "Para todos los publicos");
        controlador.Cine.añadirPeli(peli4);
        Pelicula peli5 = new Pelicula("El imperio contraataca", "EEUU", 124, "Irvin Kershner", "Mark Hamill, Harrison Ford, Carrie Fisher, Anthony Daniels, James Earl Jones, Kenny Baker", "La ficción se sitúa tres años después de la destrucción de la estación espacial de combate conocida como la Estrella de la muerte, destrucción acaecida al final del episodio anterior, Una Nueva Esperanza. En El Imperio Contraataca Luke Skywalker, Han Solo, Leia Organa y el resto de la Alianza Rebelde son perseguidos por Darth Vader y las fuerzas de élite del Imperio Galáctico", "Ciencia ficcion", "Para todos los publicos");
        controlador.Cine.añadirPeli(peli5);
        
        
        controlador.Cine.añadirSala(sala1);
        controlador.Cine.añadirSala(sala2);
        controlador.Cine.añadirSala(sala3);
        controlador.Cine.añadirSala(sala4);
        controlador.Cine.añadirSala(sala5);
        
        controlador.Cine.exportarBD();
        controlador.Cine.exportarSalasBD();
        
    }
    
    //estos metodos importan y exportan a la BD cada vez que se requiera
    public void importarBD(){
        controlador.Cine.importarPeliculas();
        controlador.Cine.importarSalas();
    }
    public void exportarBD(){
        controlador.Cine.exportarBD();
       controlador.Cine.exportarSalasBD();
    }
    
    
    

    
    
    
    
    
}
