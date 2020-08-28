
package clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductoTest {
    
    public ProductoTest() {
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
      /*caso de prueba 01*/
    @Test
    public void testValidaCodigoProducto() {
        System.out.println("ValidaCodigoProducto_CP01");
        Producto instance = new Producto(0, "peres", "ck345", "34", 0, 0);
        boolean expResult = true;
        boolean result = instance.ValidaCodigoProducto();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testValidaNombre() {
        System.out.println("ValidaNombre_CP02");
        Producto instance = new Producto(10, "peres", "ck345", "34", 20, 20);
        boolean expResult = true;
        boolean result = instance.ValidaNombre();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testValidaMarca() {
        System.out.println("ValidaMarca_CP03");
        Producto instance = new Producto(12, "peres", "ck345", "34", 20, 50);
        boolean expResult = true;
        boolean result = instance.ValidaMarca();
        assertEquals(expResult, result);  
    }
    @Test
    public void testValidaTalla() {
        System.out.println("ValidaTalla_CP04");
        Producto instance = new Producto(12, "peres", "ck345", "34", 20, 50);
        boolean expResult = true;
        boolean result = instance.ValidaTalla();
        assertEquals(expResult, result); 
    }

    @Test
    public void testValidaStock() {
        System.out.println("ValidaStock_CP05");
        Producto instance = new Producto(12, "peres", "ck345", "34", 20, 50);
        boolean expResult = true;
        boolean result = instance.ValidaStock();
        assertEquals(expResult, result); 
    }

    @Test
    public void testValidaPrecio() {
        System.out.println("ValidaPrecio_CP06");
        Producto instance = new Producto(12, "peres", "ck345", "34", 20, 50);
        boolean expResult = true;
        boolean result = instance.ValidaPrecio();
        assertEquals(expResult, result);     
    }

    @Test
    public void testRegistrarProducto() {
        System.out.println("RegistrarProducto_CP07");
        Producto instance = new Producto(12, "peres", "ck345", "34", 20, 50);
        String expResult = "Registro Satisfecho";
        String result = instance.RegistrarProducto();
        assertEquals(expResult, result);
       
    }
}
