package com.ipartek.formacion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class CerdosyDiamantesTest {

	@Test
	public void test() {
		ArrayList<IOrdenable> lista = new ArrayList<IOrdenable>();

		Cerdos c1 = new Cerdos(500, "Tiberio");
		Cerdos c2 = new Cerdos(300, "Peggy");
		Diamantes d1 = new Diamantes(1000, "rojo");
		Diamantes d2 = new Diamantes(50, "verde");

		lista.add(c1);
		lista.add(c2);
		lista.add(d1);
		lista.add(d2);

		for (IOrdenable elemento : lista) {
			if (elemento instanceof Diamantes) {
				Diamantes diamante = (Diamantes) elemento;
				diamante.getColor();
			}

			if (elemento instanceof Cerdos) {
				Cerdos cerdo = (Cerdos) elemento;
				
			}

		}
		
		
		Collections.sort(lista, new ComparadorCerdosDiamantes());

		assertEquals(d1, lista.get(0));
		assertEquals(c1, lista.get(1));
		assertEquals(c2, lista.get(2));
		assertEquals(d2, lista.get(3));

	}
}
