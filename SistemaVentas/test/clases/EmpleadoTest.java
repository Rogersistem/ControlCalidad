
package clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class EmpleadoTest {
    
    public EmpleadoTest() {
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

    
    @Test
    public void testValidacodigo() {
        System.out.println("validacodigo_CP01");
        Empleado instance = new Empleado();
        boolean expResult = false;
        boolean result = instance.validacodigo();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testValidanombre() {
        System.out.println("validanombre_CP02");
        Empleado instance = new Empleado(0, null, null, null, null, null, null);
        boolean expResult = true;
        boolean result = instance.validanombre();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testValidapellido() {
        System.out.println("validapellido_CP03");
        Empleado instance = new Empleado(12, "Julio", "moran", "las quintanas", "Admin", "julio@gmail.com", "987654329");
        boolean expResult = true;
        boolean result = instance.validapellido();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testValidadireccion() {
        System.out.println("validadireccion_CP04");
        Empleado instance = new Empleado(12, "Julio", "moran", "las quintanas", "Admin", "julio@gmail.com", "987654329");
        boolean expResult = true;
        boolean result = instance.validadireccion();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testValidademail() {
        System.out.println("validademail_CP05");
        Empleado instance = new Empleado(12, "Julio", "moran", "las quintanas", "Admin", "julio@gmail.com", "987654329");
        boolean expResult = true;
        boolean result = instance.validademail();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testValidatelefono() {
        System.out.println("validatelefono_CP06");
        Empleado instance = new Empleado(12, "Julio", "moran", "las quintanas", "Admin", "julio@gmail.com", "987654329");
        boolean expResult = true;
        boolean result = instance.validatelefono();
        assertEquals(expResult, result);

    }

    
    @Test
    public void testRegistrarEmpleado() {
        System.out.println("RegistrarEmpleado_CP07");
        Empleado instance = new Empleado(12, "Julio", "moran", "las quintanas", "Admin", "julio@gmail.com", "987654329");
        String expResult = "Registrado";
        String result = instance.RegistrarEmpleado();
        assertEquals(expResult, result);
    }
}
