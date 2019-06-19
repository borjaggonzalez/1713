package com.ipartek.formacion;

import java.util.ArrayList;

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
	
	public static ArrayList<Alumno> CargarAlumnos() {

		String[] lalumnos = { "Ander", "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eder I",
				"Eder S", "Gaizka", "Borja", "Verónica", "Jon A", "José Luis" };
	
		Alumno a;
		for (int i = 0; i < lalumnos.length; i++) {
			a = new Alumno(lalumnos[i]);
			alumnos.add(a);
		}

		return alumnos;
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Alumno> ListarAlumnos() {

		for (int i = 0; i < alumnos.size(); i++) {

			System.out.println(alumnos.get(i).getNombre()+ " " + alumnos.get(i).getNveces());

		}

		return alumnos;
	}

	public static void BuscarVoluntario() {

		int voluntario = (int) (Math.random() * alumnos.size());
		alumnos.get(voluntario).setNveces(alumnos.get(voluntario).getNveces()+1);
		// Mostrar voluntario para leer
		System.out.println("El voluntario es:");
		System.out.println(alumnos.get(voluntario).getNombre());

	}

}
