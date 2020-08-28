
package clases;

public class DetallePedido {
    
   
    private int cantidad;
    private float precio;
    
  private Producto producto;
  
  //Contructor 

    public DetallePedido( int cantidad, float precio, Producto producto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
    }
  // metodos and setters 
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
