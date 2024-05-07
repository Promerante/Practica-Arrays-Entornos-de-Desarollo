package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class minTest {

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
		float minEsperada=1;
		float minObtenida1=MisArrays.minNotas(arrayValido);
		assertEquals(minEsperada,minObtenida1);
	}
	@Test
	void minArrayVacia() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->MisArrays.minNotas(arrayVacio));
		String esperado= "La array esta vacia";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);	
	}
	@Test
	void minParamIncorrecto() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->MisArrays.minNotas(arrayNoValido));
		String esperado= "Hay al menos un valor en la array fuera del rango";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);	
	}

}
