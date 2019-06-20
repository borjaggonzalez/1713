package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aula {

	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	public static void main(String[] args) {

		// Declarar array con nombre alumnos

		String[] lalumnos = { "Ander", "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eder I",
				"Eder S", "Gaizka", "Borja", "Verónica", "Jon A", "José Luis" };

		for (int i = 0; i < lalumnos.length; i++) {
			alumnos.add(new Alumno(lalumnos[i]));
		}

		// Generar numero aleatorio 0 - alumnos.length
		int voluntario = (int) (Math.random() * alumnos.size());

		// Mostrar voluntario para leer

		for (int i = 0; i < alumnos.size(); i++) {

			if (voluntario != i) {

				System.out.println(i + " " + alumnos.get(i).getNombre());

			} else {

				System.out.println(" **** " + alumnos.get(i));

			}

		} // end for

	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Alumno> pintarResul(ArrayList<Alumno> alumnos) {
		Collections.sort(alumnos);
		for (int i = 0; i < alumnos.size(); i++) {
				System.out.println(i+1 +" -" +alumnos.get(i).getNombre() + " " + alumnos.get(i).getNveces());
				
		}
		System.out.println("Alumnos totales: "+alumnos.size());
		return alumnos;
	}

	

	
}
