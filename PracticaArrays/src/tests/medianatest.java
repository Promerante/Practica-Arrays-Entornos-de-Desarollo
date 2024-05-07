package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;

class medianatest {
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
		float medianaEsperada=2;
		float medianaObtenida1=MisArrays.medianaNotas(arrayValido);
		assertEquals(medianaEsperada,medianaObtenida1);

	}
	@Test
	void medianaArrayVacia() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->MisArrays.medianaNotas(arrayVacio));
		String esperado= "La array esta vacia";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);	
	}
	@Test
	void medianaParamIncorrecto() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->MisArrays.medianaNotas(arrayNoValido));
		String esperado= "Hay al menos un valor en la array fuera del rango";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);	
	}

}
