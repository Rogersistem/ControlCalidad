package clases;

public class Cliente {

    private int codigo;
    private String nombre = "[a-zA-Z]";
    ;
    private String apellidos = "[a-zA-Z]";
    ;
    private String tipocliente = "[a-zA-Z]";
    ;
    private String direccion = "[a-zA-Z]";
    ;
    private String email = "[a-zA-Z]";
    ;
    private String telefono = "[a-zA-Z]";

    

    // Constrcutor 
    public Cliente() {
    }

    public Cliente(int codigo, String nombre, String apellidos, String tipocliente, String direccion, String email, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipocliente = tipocliente;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }
     //validaciones para el testeo
    public boolean validacodigo() {
        if (codigo ==0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validanombre() {
        if (nombre == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validapellidos() {
        if (apellidos == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validatipoCliente() {
        if (direccion == null) {
            return false;
        } else {
            return true;
        }
    }
    public boolean validaDireccion() {
        if (direccion == null) {
            return false;
        } else {
            return true;
        }
    }
    public boolean validademail() {
        if (email == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validatelefono() {
        if (telefono == null) {
            return false;
        } else {
            return true;
        }
    }
     public String RegistrarEmpleado() {
        String mensaje = "";
        if (validacodigo() == false) {
            mensaje = "Error en el codigo";
        } else {
            if (validanombre() == false) {
                mensaje = "Error en e nombre";
            } else if (validapellidos() == false) {
                mensaje = "error en el apellido";
            } else if(validatipoCliente()==false){
                mensaje="Tipo cliente incorrecto";
            } else if (validaDireccion()== false) {
                mensaje = "Error en la direccion";
            } else if (validademail() == false) {
                mensaje = "Error en el Email";
            } else if (validatelefono() == false) {
                mensaje = "Error en el telefono";
            } else {
                mensaje= "Registrado";
            }
        }
        return mensaje;
    }
    
    
    
    // mettodos getter sand setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
