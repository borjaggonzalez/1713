package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class AlumnoVoluntario {
	static Scanner sc;
	static DAOAlumnoArrayList dao;
	static ArrayList<Alumno> alumnos;
	static Alumno alumno;
	static String ULTIMO_VOLUNTARIO = "";
	static final String OPCION_LISTAR = "1";
	static final String OPCION_CREAR = "2";
	static final String OPCION_ELIMINAR = "3";
	static final String OPCION_VOLUNTARIO = "4";
	static final String OPCION_SALIR = "0";

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		dao = DAOAlumnoArrayList.getInstance();

		String op;
		dao.cargarAlumnos();
		do {
			// Elegir Opcion
			MostrarMenu();
			op = sc.nextLine().trim();
			switch (op) {

			case OPCION_LISTAR:
				alumnos = (ArrayList<Alumno>) dao.getAll();
				dao.pintarResul(alumnos);

				break;
			case OPCION_CREAR:
				CrearVoluntario();
				break;

			case OPCION_ELIMINAR:
				EliminarVoluntario();
				break;

			case OPCION_VOLUNTARIO:
				BuscarVoluntario();
				break;

			default:
				System.out.println("No has introducido una opcion o la opcion no es valida\n");
				break;
			}

		} while (!op.equals(OPCION_SALIR));

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

	public static void CrearVoluntario() {

		String nombre;

		do {
			System.out.println("Introduce el nombre:");
			nombre = sc.nextLine();

		} while ("".equals(nombre));

		alumno = new Alumno(nombre);
		alumno.setId(dao.getAll().size() + 1);

		dao.insert(alumno);

	}

	public static void EliminarVoluntario() {

		String nombre;
		int id = -1;
		do {
			System.out.println("Introduce el nombre del alumno a dar de baja:");
			nombre = sc.nextLine().trim();

		} while ("".equals(nombre));

		for (Alumno a : dao.getAll()) {
			if (nombre.equalsIgnoreCase(a.getNombre())) {
				id = a.getId();
				break;
			}
		}

		if (dao.delete(id)) {
			System.out.println("Se ha elimindo a: " + nombre);
		} else {
			System.out.println("No se ha encontrado a: " + nombre);
		}

	}

	/**
	 * 
	 */
	public static void BuscarVoluntario() {

		int voluntario;
		do {
			voluntario = (int) (Math.random() * dao.getAll().size());
			dao.getAll().get(voluntario).setNveces(dao.getAll().get(voluntario).getNveces() + 1);
		} while (ULTIMO_VOLUNTARIO.equals(dao.getAll().get(voluntario).getNombre()));

		ULTIMO_VOLUNTARIO = dao.getAll().get(voluntario).getNombre();
		// Mostrar voluntario para leer
		System.out.println("El voluntario es:");
		System.out.println(dao.getAll().get(voluntario).getNombre());

	}

}
