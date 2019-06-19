package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoVoluntario {

	static final String OPCION_LISTAR = "1";
	static final String OPCION_CREAR = "2";
	static final String OPCION_ELIMINAR = "3";
	static final String OPCION_VOLUNTARIO = "4";
	static final String OPCION_SALIR = "0";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op;
		Aula.CargarAlumnos();
		do {
			// Elegir Opcion
			MostrarMenu();
			op = sc.nextLine().trim();
			
			
			switch (op) {
			case OPCION_LISTAR:
				Aula.ListarAlumnos();
				break;
			case OPCION_CREAR:
				System.out.println("Creando alumno....");
				break;

			case OPCION_ELIMINAR:
				System.out.println("Borrando alumno....");
				break;

			case OPCION_VOLUNTARIO:
				Aula.BuscarVoluntario();
				break;

			}

		} while (op != OPCION_SALIR);
		sc.close();

	}

	private static void MostrarMenu() {

		System.out.println(OPCION_LISTAR + " - Listar Alumnos + Ranking");
		System.out.println(OPCION_CREAR + " - Crear Alumno");
		System.out.println(OPCION_ELIMINAR + " - Eliminar Alumno");
		System.out.println(OPCION_VOLUNTARIO + " - Buscar Voluntario");
		System.out.println(OPCION_SALIR + " - Salir");

		System.out.println("Elige una opcion:");
	}

}
