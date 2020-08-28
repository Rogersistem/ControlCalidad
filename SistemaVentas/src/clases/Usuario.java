package clases;

import java.util.HashMap;

public class Usuario {

    private String nombre;
    private String clave;
    // se implementa una ocleccion
    HashMap<String, Usuario> lastmap = null;

    public Usuario() {
        lastmap = new HashMap<>();
    }

    public Usuario(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    // metodo para garegar un usuario 
    public String AdicionarUsuario(Usuario usuario, String clave) {
        // variable que va indicar que se registro el usuario
        String rpta;

        if (usuario != null) {
            this.lastmap.put(clave, usuario);
            rpta = "Se registro el Usuario";
        } else {
            rpta = "No se registro el Usuario";
        }
        return rpta;
    }

    //buscar Usuario por clave
    public Usuario obtenerUsuario(String clave) {
        
        return this.lastmap.get(clave);
    }
    // metodos getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
