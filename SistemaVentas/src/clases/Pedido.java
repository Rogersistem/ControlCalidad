package clases;

import java.sql.Date;

public class Pedido {

    private String numero = "[P][L][0-9][0-9]";
    private String cliente = "[a-z-A-Z]";
    private String empleado="[a-zA-Z]";
    private String fecha ="[a-zA-Z][0-9][0-9]";
    private int ndetalle;
    private DetallePedido[] detalle;

    // constructor 
    public Pedido(String numero, String cliente, String empleado, String fecha) {
        this.numero = numero;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fecha = fecha;

        this.ndetalle = 0;
        this.detalle = new DetallePedido[100];
    }

    //metodos adicionar
    public String AddDetalle(DetallePedido deta) {
        String rpte;

        if (this.ndetalle < 1000) {

            this.detalle[this.ndetalle] = deta;

            this.ndetalle++;

            rpte = "Se registro el Detalle";
        } else {

            rpte = "No se registro e detalle";

        }
        return rpte;
    }

    //obtiene el detalle del peddido
    public DetallePedido obtenerDetalle(int indice) {

        if (indice < 0 || indice >= this.ndetalle) {
            return null;
        } else {
            return this.detalle[indice];
        }
    }

    //calcula el total 
    public float CalculaTotal() {
        float total = 0;

        for (int i = 0; i < this.ndetalle; i++) {

            int cantidad = this.detalle[i].getCantidad();
            float precio = this.detalle[i].getPrecio();
            // acumular 
            total += cantidad * precio;
        }
        return total;
    }
// getters and setters 

    //metodos getter
    public String getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNdetalle() {
        return ndetalle;
    }

    public DetallePedido[] getDetalle() {
        return detalle;
    }

}
