
package examen2lab_kennethnuñez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminUsuarios {
    private ArrayList<Usuarios> users = new ArrayList();
    private File archivo = null;

    public adminUsuarios(String path) {
        archivo = new File(path);
    }

    public adminUsuarios() {
    }
    

    public ArrayList<Usuarios> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuarios> users) {
        this.users = users;
    }
    
    public void addUsuario(Usuarios nuevo){
        this.users.add(nuevo);
    }
    
    public void cargarArchivo(){
        try{
            users = new ArrayList();
            Usuarios temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while((temp = (Usuarios)objeto.readObject()) != null   ){
                        users.add(temp);
                    }
                }catch(EOFException e){
                    //encontro el final del Archivo.
                }
                objeto.close();
                entrada.close();
                
            } //Fin if.  
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try{
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios t : users) {
                bw.writeObject(t);
            }
            bw.flush();
        }catch(Exception ex){
            
        }finally{
            try{
                bw.close();
                fw.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
        
    }
    
    
}
