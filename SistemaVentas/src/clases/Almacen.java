
package clases;


public class Almacen {
    
    private String nombre;
    
    
    private int nproducto;
    private Producto[] producto;
    
    //Constructor

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.nproducto = 0;
        this.producto = new Producto[1000];
    }

    //adiconar prodcuto
    public String adicionarProducto(Producto p) {
        String rpta;
        if (this.nproducto < 100) {
            this.producto[this.nproducto] = p;
            this.nproducto++;
            rpta = "Se ha registrado el producto ";
        } else {
            rpta = "No se a registardo el producto";
        }
        return rpta;
    }
public Producto obtenerProducto(int indice){
    
    if(indice < 0 ||  indice>=this.nproducto){
        return  null;
    }else{
        return  this.producto[indice];
    }
  }
//metodo que permite buscar producto
public Producto BuscarProducto(String nombre){
    Producto pro = null;
    //recorre arreglo de productos 
    for(int i=0; i<this.nproducto;i++){
        //verifica si existe el producto 
        if(nombre.equals(this.producto[i].getNombre())){
            pro= this.obtenerProducto(i);
            break;
        };
    }
    return pro;
}
// metodos Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public int getNproducto() {
        return nproducto;
    }
 
}
