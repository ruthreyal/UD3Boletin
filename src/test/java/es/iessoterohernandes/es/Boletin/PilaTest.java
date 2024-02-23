package es.iessoterohernandes.es.Boletin;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {
	
	private static Pila pila;

	@BeforeEach
	
	public void setUp() {
		pila = new Pila();  
	} 
		
//test push numero menor que 2
	@Test
	public void pushMenor() {
		pila.push(1);;   
		assertTrue(pila.isEmpty());    
		} 
	

//test push numero mayor que 20

		@Test
		public void pushMayor() {
			pila.push(22);   
			assertTrue(pila.isEmpty());      
		}
		
//test push numero entre 2 y 20
		@Test
		public void push() {
			pila.push(15);   
			assertFalse(pila.isEmpty());     
		}
		
		//test metodo pop
		@Test
		public void pop() {
			pila.push(8);
			
			assertEquals(pila.pop(),8);
			
		}
		//test metodo vacio
		@Test 
		public void isEmpty() {
			assertTrue(pila.isEmpty());
		}
		
		//test metodo top
		public void top() {
			assertTrue(pila.isEmpty());
			pila.push(8);
			assertEquals(pila.top(),8);
		}
		
		


}
