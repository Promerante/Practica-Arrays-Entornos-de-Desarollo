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
class MisArraysTest {
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
		float mediaEsperada=6;
		float mediaObtenida1=MisArrays.mediaNotas(arrayValido);
		float mediaObtenida2=MisArrays.mediaNotas(arrayNoValido);
		float mediaObtenida3=MisArrays.mediaNotas(arrayVacio);
		assertEquals(mediaEsperada,mediaObtenida1);
		assertEquals(mediaEsperada,mediaObtenida2);
		assertEquals(mediaEsperada,mediaObtenida3);
	}
	@Test
	void mediaParamIncorrecto() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->MisArrays.mediaNotas(arrayVacio));
		String esperado= "La array esta vacia";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);	
	}


}
