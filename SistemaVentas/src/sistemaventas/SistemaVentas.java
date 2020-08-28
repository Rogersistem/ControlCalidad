package sistemaventas;

import clases.Almacen;
import clases.DetallePedido;
import clases.Pedido;
import clases.Producto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SistemaVentas {
// varibles 

    static Producto oPr = null;
    static Almacen aAl = null;
    static Pedido oPe = null;
    static DetallePedido oDp = null;
    // LEE DATOS QUE SE INGRESAN EN CONSOLA 
    static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String nombreProducto, marca, talla, categoria, fecha, cliente, empleado, numOperacion;
        int codigoProducto;

        //creamo el objeto almacen
        aAl = new Almacen("Principal");
        ////////////////////////////////////////////
       String validacodigo = "[a-zA-Z]";
       String validamarca = "[a-zA-Z]";
       String  validatalla = "[a-zA-Z]";
       
        Scanner sc = new Scanner(System.in);
        
        int opcion, stock, cantidadDetalle;
        float precio;
  
     
        do {
            System.out.println("\n\t\t\tMENU: GESTION DE VENTAS");
            System.out.println("\t\t\t================================");
            System.out.println("\t\t\t1.- Ingresar Productos");
            System.out.println("\t\t\t2.- Generar Pedido");
            System.out.println("\t\t\t3.- Listar  Productos");
            System.out.println("\t\t\t4.- Listar Pedido");
            System.out.println("\t\t\t5.- Salir");

            System.out.println("\n INGRESE LA OPCION");
            opcion = Integer.parseInt(buf.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("INGRESO DE PRODUCTOS");
                    System.out.println("====================");
                    System.out.println("Ingrese CodigoProducto");
                    //codigoProducto = Integer.parseInt(buf.readLine());
                    codigoProducto =Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese Nombre");
                    //nombreProducto = buf.readLine();
                    nombreProducto= sc.nextLine();
                    System.out.println("Ingrese Marca");
                   // marca = buf.readLine();
                     marca= sc.nextLine();
                    System.out.println("Ingrese Talla");
                    //talla = buf.readLine();
                     talla= sc.nextLine();
                    System.out.println("Ingrese Stock :");
                    //stock = Integer.parseInt(buf.readLine());
                     stock =Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese Precio :");
                    //precio = Float.parseFloat(buf.readLine());
                     precio =Float.parseFloat(sc.nextLine());
                    
                    if(!nombreProducto.matches(nombreProducto)){
                        System.out.println("Codigo errado");
                    }
                    else if(!marca.matches(marca)){
                        System.out.println("marca errada");
                    }else if(!talla.matches(talla)){
                        System.out.println("Talla Errada");
                    }else{
                        Producto pro= new Producto(codigoProducto, marca, marca, talla, stock, precio);
                        System.out.println(pro.RegistrarProducto());
                    
                }
                    
                    oPr = new Producto(codigoProducto, nombreProducto, marca, talla, stock, precio);
                    System.out.println(aAl.adicionarProducto(oPr));
                    break;
                case 2:
                    System.out.println("GENERAR EL PEDIDO");
                    System.out.println("======================");
                    System.out.println("Numero");
                    numOperacion = buf.readLine();
                    System.out.println("Fecha");
                    fecha = buf.readLine();
                    System.out.println("Cliente");
                    cliente =buf.readLine(); 
                    System.out.println("Empleado");
                    empleado =buf.readLine();
                    //System.out.println("Cantidad");
    
                    //craciion de objeto empleado 
                    oPe = new Pedido(numOperacion, fecha, cliente, empleado);
                    
                    //agregamos los detalles
                    System.out.println("DETALLE DE PEDIDO");
                    System.out.println("================================");
                    for (int i = 0; i < aAl.getNproducto(); i++) {
                        System.out.println("Ingrese Cantidad Solicitada [" + i + "]:de producto " + aAl.obtenerProducto(i).getNombre() + ":");
                        cantidadDetalle = Integer.parseInt(buf.readLine());
                        Producto pro = aAl.obtenerProducto(i);
                        //agregar

                        oPe.AddDetalle(new DetallePedido(cantidadDetalle, pro.getPrecio(), pro));

                    }
                    break;

                case 3:
                    System.out.println("LISTA PRODUCTOS DE ALMACEN" + aAl.getNombre());
                    System.out.println("==========================");
                    //recorre arreglo de productos 
                    for (int i = 0; i < aAl.getNproducto(); i++) {
                        Producto pro = aAl.obtenerProducto(i);

                        System.out.println(pro.toString());
                        System.out.println("CodigoProducto  ******************************** : " + pro.getCodigoProducto());
                        System.out.println("Nombre          ******************************** : " + pro.getNombre());
                        System.out.println("Marca           ******************************** : " + pro.getMarca());
                        System.out.println("Talla           ******************************** : " + pro.getTalla());
                        System.out.println("Stok            ******************************** : " + pro.getStock());
                        System.out.println("Precio          ******************************** : S/." + pro.getPrecio());

                    }
                    break;
                case 4:

                    System.out.println("INGRESE UN PEDIDO");
                    System.out.println("===========================");
                    System.out.println(" Ingrese un Nro Pedido ***************************** : " + oPe.getNumero());
                    System.out.println(" ingrese una Fechas     ***************************** : " + oPe.getFecha());
                    System.out.println("ingrese un Cliente    ***************************** : " + oPe.getCliente());
                    System.out.println("asigne un Empleado   ***************************** : " + oPe.getEmpleado());
                    // recorrer detalles
                    for (int i = 0; i < oPe.getNdetalle(); i++) {
                        // se obtiene el objto de detalle  pedido 
                        DetallePedido detalle = oPe.obtenerDetalle(i);
                        //obtener objeto producto 
                        Producto pro = detalle.getProducto();
                        System.out.println(pro.toString());
                    }
                    System.out.println("TOTAL      ***************************** : S/. " + oPe.CalculaTotal());
                    break;
                case 5:
                    break;
            }
        } while (opcion
                != 0);
    }

}
