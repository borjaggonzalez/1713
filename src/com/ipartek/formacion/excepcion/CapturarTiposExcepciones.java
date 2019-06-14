package com.ipartek.formacion.excepcion;

import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;

/**
 * Se pueden capturar mas de un tipo de Excepciones Siempre la ultima en
 * capturar que sea Exception que es la mas generica.
 * 
 * @author Curso
 *
 */
public class CapturarTiposExcepciones {

	public static void main(String[] args) {
		try {
			// Perro p = null;
			int[] array = new int[3];

			array[0] = 24;
			array[1] = 48;
			array[2] = 12;

			System.out.println(array[4]);

			Perro p = new Perro();
			p.setEdad(-1);
			p.toString();

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Se ha salido fuera del Array");
			e.printStackTrace();

		} catch (PerroException e) {

			System.out.println("PerroExcepcion Edad");
			e.printStackTrace();

		} catch (NullPointerException e) {

			System.out.println("Excepcion Null");
			e.printStackTrace();

		} catch (Exception e) {

			System.out.println("Excepcion generica, siempre la ultima");
			e.printStackTrace();
		}
	}
}
