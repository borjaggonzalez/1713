package com.ipartek.formacion;

public class Aula {

	public static void main(String[] args) {

		// Declarar array con nombre alumnos
		String[] alumnos = { 
							 "Ander",
							 "Mounir", 
							 "Andoni", 
							 "Asier",
							 "Jon C", 
							 "Arkaitz", 
							 "Aritz", 
							 "Manuel", 
							 "Eduardo", 
							 "Eder I", 
							 "Eder S", 
							 "Gaizka", 
							 "Borja", 
							 "Verónica", 
							 "Jon A", 
							 "José Luis" 
							 };

		// Generar numero aleatorio 0 - alumnos.length
		int voluntario = (int) (Math.random() * alumnos.length);

		// Mostrar voluntario para leer

		for (int i = 0; i < alumnos.length; i++) {

			if (voluntario != i) {

				System.out.println(i + " " + alumnos[i]);

			} else {

				System.out.println(" **** " + alumnos[i]);

			}

		} // end for

	}

}
