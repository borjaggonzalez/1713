package com.ipartek.formacion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CerdosyDiamantes {

	@Test
	public void test() {
		ArrayList<IOrdenable> lista = new ArrayList<IOrdenable>();

		Cerdos c = new Cerdos();
		Diamantes d = new Diamantes();

		lista.add(c);
		lista.add(d);
	}

}
