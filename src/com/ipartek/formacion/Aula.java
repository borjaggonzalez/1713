package com.ipartek.formacion;

import java.util.ArrayList;

public class Aula {

	public static void main(String[] args) {

		// Declarar array con nombre alumnos


		  String[] lalumnos = { "Ander", "Mounir", "Andoni", "Asier", "Jon C",
		  "Arkaitz", "Aritz", "Manuel", "Eduardo", "Eder I", "Eder S", "Gaizka",
		 "Borja", "Verónica", "Jon A", "José Luis" };
		  
		
		  ArrayList<Person> alumnos= new ArrayList<Person>();
		Person p;
		
		for (int i = 0; i < lalumnos.length; i++) {
			p = new Person();
			p.setNombre(lalumnos[i]);
			alumnos.add(p);
		}
		

		// Generar numero aleatorio 0 - alumnos.length
		int voluntario = (int) (Math.random() * alumnos.size());

		// Mostrar voluntario para leer

		for (int i = 0; i < alumnos.size(); i++) {

			if (voluntario != i) {

				System.out.println(i + " " + alumnos.get(i));

			} else {

				System.out.println(" **** " + alumnos.get(i));

			}

		} // end for

	}

}
