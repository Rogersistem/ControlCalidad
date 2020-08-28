package clases;

public class Empleado {

    // atributos
    private int codigo;
    private String nombre = "[a-zA-Z]";
    ;
    private String apellidos = "[a-zA-Z]";
    ;
    private String direccion = "[a-zA-Z]";
    ;
    private String cargo = "[a-zA-Z]";
    ;
    private String email = "[a-zA-Z]";
    ;
    private String telefono = "[a-zA-Z]";

    ;

    //constructor
    public Empleado() {

    }

    public Empleado(int codigo, String nombre, String apellidos, String direccion, String cargo, String email, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.cargo = cargo;
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

    public boolean validapellido() {
        if (apellidos == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validadireccion() {
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
            } else if (validapellido() == false) {
                mensaje = "error en el apellido";
            } else if (validadireccion() == false) {
                mensaje = "Error en la direccion";
            } else if (validademail() == false) {
                mensaje = "Error en el correo";
            } else if (validatelefono() == false) {
                mensaje = "Error en el telefono";
            } else {
                mensaje= "Registrado";
            }
        }
        return mensaje;
    }

    //metodos getters and setters 
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
