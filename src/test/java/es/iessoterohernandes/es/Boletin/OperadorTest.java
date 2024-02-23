package es.iessoterohernandes.es.Boletin;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class OperadorTest {
	public static OperadorAritmetico operadorAritmetico;
	
	@BeforeEach
	public void init() {
		operadorAritmetico = new OperadorAritmetico();
	}
	
	@Test
	public void testSuma() {
		 assertThat(operadorAritmetico, notNullValue());
		    assertThat(OperadorAritmetico.suma(2, 3), is(5.0f));
	}
	
	@Test
	public void testDivisionExcepcion() throws Exception {
		try {
			OperadorAritmetico.division(5, 0);
		} catch (Exception e) {
			
		}
		assertEquals(OperadorAritmetico.division(10, 2),5);
	}
	

}
