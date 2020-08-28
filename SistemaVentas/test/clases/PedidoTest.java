
package clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PedidoTest {
    
    public PedidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
/*
    //casos de pruba
    @Test
    public void testAddDetalle() {
        System.out.println("AddDetalle");
        DetallePedido deta = new DetallePedido(0, 0, );
        Pedido instance = new Pedido("12", "petter", "Emilio", "elmer");
        String expResult = "";
        String result = instance.AddDetalle(deta);
        assertEquals(expResult, result);
       
    }*/

    
    @Test
    public void testObtenerDetalle() {
        System.out.println("obtenerDetalle");
        int indice = 0;
        Pedido instance = new Pedido("12", "petter", "Emilio", "elmer");
        DetallePedido expResult = null;
        DetallePedido result = instance.obtenerDetalle(indice);
        assertEquals(expResult, result);
       
    }

   
    @Test
    public void testCalculaTotal() {
        System.out.println("CalculaTotal");
        Pedido instance = new Pedido("12", "petter", "Emilio", "elmer");
        float expResult = 11.0F;
        float result = instance.CalculaTotal();
        assertEquals(expResult, result, 12.0);
        
    }

    
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Pedido instance = new Pedido("12", "petter", "Emilio", "elmer");
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCliente method, of class Pedido.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Pedido instance = new Pedido("12", "petter", "Emilio", "elmer");
        String expResult = "";
        String result = instance.getCliente();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getEmpleado method, of class Pedido.
     */
    @Test
    public void testGetEmpleado() {
        System.out.println("getEmpleado");
        Pedido instance = new Pedido("12", "petter", "Emilio", "elmer");
        String expResult = "";
        String result = instance.getEmpleado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFecha method, of class Pedido.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Pedido instance = new Pedido("12", "petter", "Emilio", "elmer");
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNdetalle method, of class Pedido.
     */
    @Test
    public void testGetNdetalle() {
        System.out.println("getNdetalle");
        Pedido instance = new Pedido("12", "petter", "Emilio", "elmer");
        int expResult = 0;
        int result = instance.getNdetalle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDetalle method, of class Pedido.
     */
    @Test
    public void testGetDetalle() {
        System.out.println("getDetalle");
        Pedido instance = new Pedido("12", "petter", "Emilio", "elmer");
        DetallePedido[] expResult = null;
        DetallePedido[] result = instance.getDetalle();
        assertArrayEquals(expResult, result);
        
    }
    
}
