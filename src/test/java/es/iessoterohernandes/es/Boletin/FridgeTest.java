package es.iessoterohernandes.es.Boletin;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FridgeTest {

	static Stream<Arguments> FridgeDatos() {
	    return Stream.of(
	            Arguments.of("Huevo"),
	            Arguments.of("Leche"), 
	            Arguments.of("Yogurt"),
	            Arguments.of("mantequilla"));
	           
	}
	
	@ParameterizedTest
	@MethodSource("FridgeDatos")
	public void put(String item, boolean lleno) {
	    Fridge frigo = new Fridge ();
		assertEquals(frigo.put("Huevo"),lleno);

	}
	
	@ParameterizedTest
	@MethodSource("FridgeDatos")
	public void contains(String item, boolean esperado) {
	    Fridge frigo = new Fridge ();
		assertEquals(frigo.contains("Huevo"),true);
		

	}
	
	@ParameterizedTest
	@MethodSource("FridgeDatos")
	public void NoSuchItemException(String item) throws es.iessoterohernandes.es.Boletin.NoSuchItemException {
	    Fridge frigo = new Fridge ();
	    frigo.put("Huevo");
	    frigo.take("Huevo");
	    
		

	}
	
	
	

}
