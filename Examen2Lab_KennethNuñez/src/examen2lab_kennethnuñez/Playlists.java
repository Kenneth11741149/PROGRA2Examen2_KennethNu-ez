
package examen2lab_kennethnuñez;

import java.io.Serializable;
import java.util.ArrayList;


public class Playlists implements Serializable{
    private String nombre;
    private ArrayList<cancion> songs = new ArrayList();
    
    private static final long SerialVersioUID=777L;

    public Playlists(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<cancion> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<cancion> songs) {
        this.songs = songs;
    }
    public void AddSong(cancion x){
        songs.add(x);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
