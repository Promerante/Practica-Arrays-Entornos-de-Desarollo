package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class maxTest {

	static float[] arrayValido;
	static float[] arrayNoValido;
	static float[] arrayVacio;
	
	
	@BeforeAll
	static void arrayEjemplo(){
		arrayValido=new float[]{1,2,3};
		arrayNoValido=new float[]{11,2,3};
		arrayVacio=new float[0];
	}

	@Test
	void test() {
		float maxEsperada=3;
		float maxObtenida1=MisArrays.maxNotas(arrayValido);
		assertEquals(maxEsperada,maxObtenida1);

	}
	@Test
	void maxArrayVacia() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->MisArrays.maxNotas(arrayVacio));
		String esperado= "La array esta vacia";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);	
	}
	@Test
	void maxParamIncorrecto() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->MisArrays.maxNotas(arrayNoValido));
		String esperado= "Hay al menos un valor en la array fuera del rango";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);	
	}

}
