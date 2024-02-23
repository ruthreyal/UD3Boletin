package es.iessoterohernandes.es.Boletin;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BoaTest {

	
	
	
	static Stream<Arguments> BoaDatos() {
	    return Stream.of(
	            Arguments.of("Maria",8,"pan", false),
	            Arguments.of("Pepe",12,"granola bars", true),
	            Arguments.of("Juan",7,"manzanas", false),
	            Arguments.of("Marta", 6, "granola bars",true));
	}
	
	 
	
	
	
	@ParameterizedTest
	@MethodSource("BoaDatos")
	public void isHealthyTest(String name, int length, String favoriteFood, boolean experado) {
	    Boa boa = new Boa (name, length, favoriteFood);
		assertEquals(experado, boa.isHealthy());

	}
	
	@ParameterizedTest
	@MethodSource("BoaDatos")
	public void fitsInCage(String name, int length, String favoriteFood, boolean experado) {
	    Boa boa = new Boa (name, length, favoriteFood);
		assertEquals(experado, boa.fitsInCage(12));

	}
	
	

}
