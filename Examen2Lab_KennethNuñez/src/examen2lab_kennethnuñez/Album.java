/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_kennethnuñez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Burni
 */
public class Album implements Serializable{
    private String nombre;
    private String artista;
    private ArrayList<cancion> canciones = new ArrayList();
    
     private static final long SerialVersioUID=767L;

    public Album() {
    }

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<cancion> getCanciones() {
        return canciones;
    }
    
    public void AddCancion(cancion x){
        canciones.add(x);
    }

    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
     
     
}
