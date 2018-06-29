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
public class Usuarios implements Serializable {
     private String nombre;
     private String edad;
     private String username;
     private String password;
     private ArrayList<Playlists> playlists = new ArrayList();
     private ArrayList favoritos = new ArrayList();
     private static final long SerialVersioUID=767L;

    public Usuarios(String nombre, String edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList playlists) {
        this.playlists = playlists;
    }

    public ArrayList getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return username;
    }
     
    
}
