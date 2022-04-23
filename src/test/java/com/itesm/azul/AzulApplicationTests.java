package com.itesm.azul;

import com.itesm.azul.services.Calcu.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class AzulApplicationTests {

	private final CalculadoraService calculadoraService= new CalculadoraService();

	@Test
	void contextLoads() {
	}

	@Test
	void pruebaSuma(){
		assertEquals("Prueba de suma: ",4,calculadoraService.suma(2,2));
		assertEquals("Prueba de suma: ",5,calculadoraService.suma(3,2));
	}

	@Test
	void pruebaResta(){
		assertEquals("Prueba de resta: ", 1, calculadoraService.resta(3,2));
		assertEquals("Prueba de resta: ", 4, calculadoraService.resta(10,6));
	}

	@Test
	void pruebaMultiplicacion(){
		assertEquals("Prueba de multiplicacion: ", 12, calculadoraService.multiplicacion(6,2));
		assertEquals("Prueba de multiplicacion: ", 0, calculadoraService.multiplicacion(120,0));
	}

	@Test
	void pruebaDivision(){
		assertEquals("Prueba de division: ", 4.0, calculadoraService.division(8,2));
		assertEquals("Prueba de division: ", 6.0, calculadoraService.division(36,6));
	}

	@Test
	void pruebaSeno(){
		assertEquals("Prueba de seno: ", 0.0, calculadoraService.seno(0));
		assertEquals("Prueba de seno: ", 0.5, calculadoraService.seno(30));
	}

	@Test
	void pruebaCoseno(){
		assertEquals("Prueba de coseno: ", 1.0, calculadoraService.coseno(0));
		assertEquals("Prueba de coseno: ", 0.5, calculadoraService.coseno(60));
	}

	@Test
	void pruebaTangente(){
		assertEquals("Prueba de tangente: ", 0.0, calculadoraService.tangente(0));
		assertEquals("Prueba de tangente: ", 1.0, calculadoraService.tangente(45));
	}
}
