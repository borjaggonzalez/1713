package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoVoluntario {

	public static void main(String[] args) {

		MostrarMenu();
		String op;

		// Elegir Opcion
		Scanner sc = new Scanner(System.in);
		op = sc.nextLine().trim();

		switch (op) {
		case "1":
			System.out.println("Listando alumnos....");
			break;
		case "2":
			System.out.println("Creando alumno....");
			break;

		case "3":
			System.out.println("Borrando alumno....");
			break;
			
		case "4":
			System.out.println("Eligiendo voluntario....");
			break;
		}

		
		sc.close();
	}

	private static void MostrarMenu() {
	
		System.out.println("1 - Listar Alumnos + Ranking");
		System.out.println("2 - Crear Alumno");
		System.out.println("3 - Eliminar Alumno");
		System.out.println("4 - Buscar Voluntario");
		
		System.out.println("Elige una opcion:");
	}

	
}
