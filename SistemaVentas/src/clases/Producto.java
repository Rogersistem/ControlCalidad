package clases;

public class Producto {

    //atributos
    private int codigoProducto;
    private String nombre = "[a-zA-Z]";
    private String marca = "[a-zA-Z]";
    private String talla = "[a-zA-Z]";
    private int Stock;
    private float precio;

    //constructor vacio
    public Producto() {
    }

    //constructor
    public Producto(int codigoProducto, String nombre, String marca, String talla, int Stock, float precio) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.talla = talla;
        this.Stock = Stock;
        this.precio = precio;
    }

    /// datos de Varlidaciones para testear
     public boolean ValidaCodigoProducto() {
        if (codigoProducto == 0) {
            return false;
        }
        return true;
    }
    public boolean ValidaNombre() {
        if (nombre == null) {
            return false;
        }
        return true;
    }

    public boolean ValidaMarca() {
        if (marca == null) {
            return false;
        }
        return true;
    }

    public boolean ValidaTalla() {
        if (talla == null) {
            return false;
        }
        return true;
    }

    public boolean ValidaStock() {
        if (Stock == 0) {
            return false;
        }
        return true;
    }

    public boolean ValidaPrecio() {
        if (precio == 0) {
            return false;
        }
        return true;
    }
    public String RegistrarProducto() {
        String mensaje = "";
        
        if(ValidaCodigoProducto()==false){
            mensaje="Error CODIGO";
        }else{
         if (ValidaNombre() == false) {
                mensaje = "error nombre";
        } else {
            if (ValidaMarca() == false) {
                mensaje = "error Marca";
        } else {
            if (ValidaTalla() == false) {
                mensaje = "Error Talla";
        } else {
            if (ValidaStock() == false) {
                mensaje = "Error Stock";
        } else {
            if (ValidaPrecio() == false) {
                mensaje = "Error Precio";
                        }
            else{
                mensaje="Registro Satisfecho";
                 }
               }
             }
           }
         }
        }
        return mensaje;
        
    }
    
    // metodos getter y setters
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
