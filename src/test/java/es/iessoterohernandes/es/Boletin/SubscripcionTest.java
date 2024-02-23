package es.iessoterohernandes.es.Boletin;







import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class SubscripcionTest 
{
    
	private static Subscripcion subscripcion;
	
	@BeforeEach
	public void init() {
		subscripcion = new Subscripcion(120,12); 
	}
	
	
    @Test
    public void precioPorMes() {
    	assertEquals(subscripcion.precioPorMes(), 10);
    }
    
    @Test
    public void cancel() {
    	
    }
}
