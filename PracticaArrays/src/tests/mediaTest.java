/**
 * @author FacundoBenitez
 */
package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import util.MisArrays;

/**
 * 
 */
class mediaTest {
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
		float mediaEsperada=2;
		float mediaObtenida1=MisArrays.mediaNotas(arrayValido);
		assertEquals(mediaEsperada,mediaObtenida1);
	}
	@Test
	void mediaArrayVacia() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->MisArrays.mediaNotas(arrayVacio));
		String esperado= "La array esta vacia";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);	
	}
	
	@Test
	void mediaParamIncorrecto() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->MisArrays.mediaNotas(arrayNoValido));
		String esperado= "Hay al menos un valor en la array fuera del rango";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}


}
