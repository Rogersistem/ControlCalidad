
package clases;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
    
    public ClienteTest() {
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
        Cliente instance = new Cliente(5, "Jack", "Pinedo", "Juridica", "av.america 12", "jpinedo@gmail.com", "908765432");
        boolean expResult = true;
        boolean result = instance.validacodigo();
        assertEquals(expResult, result);
      
    }

   
    @Test
    public void testValidanombre() {
        System.out.println("validanombre_CP02");
        Cliente instance = new Cliente(5, "Jack", "Pinedo", "Juridica", "av.america 12", "jpinedo@gmail.com", "908765432");
        boolean expResult = true;
        boolean result = instance.validanombre();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testValidapellidos() {
        System.out.println("validapellidos_CP03");
        Cliente instance = new Cliente(5, "Jack", "Pinedo", "Juridica", "av.america 12", "jpinedo@gmail.com", "908765432");
        boolean expResult = true;
        boolean result = instance.validapellidos();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testValidatipoCliente() {
        System.out.println("validatipoCliente_CP04");
        Cliente instance = new Cliente(5, "Jack", "Pinedo", "Juridica", "av.america 12", "jpinedo@gmail.com", "908765432");
        boolean expResult = true;
        boolean result = instance.validatipoCliente();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testValidaDireccion() {
        System.out.println("validaDireccion_CP05");
        Cliente instance = new Cliente(5, "Jack", "Pinedo", "Juridica", "av.america 12", "jpinedo@gmail.com", "908765432");
        boolean expResult = true;
        boolean result = instance.validaDireccion();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testValidademail() {
        System.out.println("validademail");
        Cliente instance = new Cliente(5, "Jack", "Pinedo", "Juridica", "av.america 12", "jpinedo@gmail.com", "908765432");
        boolean expResult = true;
        boolean result = instance.validademail();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testValidatelefono() {
        System.out.println("validatelefono");
        Cliente instance = new Cliente();
        boolean expResult = true;
        boolean result = instance.validatelefono();
        assertEquals(expResult, result);
       
    }

   
    @Test
    public void testRegistrarEmpleado() {
        System.out.println("RegistrarEmpleado");
        Cliente instance = new Cliente(5, "Jack", "Pinedo", "Juridica", "av.america 12", "jpinedo@gmail.com", "908765432");
        String expResult = "Registrado";
        String result = instance.RegistrarEmpleado();
        assertEquals(expResult, result);
        
    }

}
