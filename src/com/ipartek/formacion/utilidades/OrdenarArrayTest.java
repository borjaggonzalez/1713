package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenarArrayTest {

	@Test
	public void testOrdenarArray() throws Exception {
		int[] numeros = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		int[] nOrdenado = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] resultado = OrdenarArray.ordenarArray(numeros);

		for (int i = 0; i < numeros.length; i++) {
			assertEquals(nOrdenado[i], resultado[i]);
		}

	}

	@Test
	public void testOrdenarRepetidosArray() throws Exception {
		int[] numeros = { 3, 0, 3, 8, 7, 5, 5, 4, 6, 9 };
		int[] nOrdenado = { 0, 3, 3, 4, 5, 5, 6, 7, 8, 9 };
		int[] resultado = OrdenarArray.ordenarArray(numeros);

		for (int i = 0; i < numeros.length; i++) {
			assertEquals(nOrdenado[i], resultado[i]);
		}

	}

	@Test
	public void testOrdenarNegativosArray() throws Exception {
		int[] numeros = { -3, 0, 3, 8, 7, -5, 5, 4, 6, 9 };
		int[] nOrdenado = { -5, -3, 0, 3, 4, 5, 6, 7, 8, 9 };
		int[] resultado = OrdenarArray.ordenarArray(numeros);

		for (int i = 0; i < numeros.length; i++) {
			assertEquals(nOrdenado[i], resultado[i]);
		}

	}

	@Test(expected = Exception.class)
	public void testOrdenarArrayNull() throws Exception {
			 OrdenarArray.ordenarArray(null);

	}

}
