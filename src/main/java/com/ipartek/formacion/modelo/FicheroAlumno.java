package com.ipartek.formacion.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.ipartek.formacion.Alumno;

public class FicheroAlumno {

	public static void main(String[] args) throws Exception {
		DAOAlumnoArrayList dao = DAOAlumnoArrayList.getInstance();
		String ficheroListadoAlumnos = "alumnos.txt";
		dao.cargarAlumnos();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroListadoAlumnos));
		for (Alumno a : dao.getAll()) {
			oos.writeObject(a);
			oos.flush();
		}
		
		oos.close();
		// TODO leer objeto del fichero
		// @see http://www.chuidiang.org/java/ficheros/ObjetosFichero.php

		System.out.println("Leyendo Listado alumnos\n");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheroListadoAlumnos));) {

			// TODO mirar para no resetear
			
			Object aux = ois.readUnshared();
			ois.available();
			while (aux != null ) {

				if (aux instanceof Alumno ) {
					System.out.println(aux); // Se escribe en pantalla el objeto
				}

				aux = ois.readObject();
				
			}
			ois.available();
			System.out.println("Terminamos de leer");
		}
	
		
	}

	public static List<Alumno> crearFichero(List<Alumno> lista) throws Exception {
		String ficheroListadoAlumnos = "alumnos.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroListadoAlumnos));
		oos.writeObject(DAOAlumnoArrayList.getInstance().getAll());
		oos.flush();

		// TODO leer objeto del fichero
		// @see http://www.chuidiang.org/java/ficheros/ObjetosFichero.php

		System.out.println("Leyendo Listado alumnos\n");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheroListadoAlumnos));) {
		
			// TODO mirar para no resetear
			int elementCount = ois.readInt();
			Object aux = ois.readObject();
			while (aux != null) {
				
					if (aux instanceof Alumno)
						System.out.println(aux); // Se escribe en pantalla el objeto
						aux = ois.readObject();

				
			}

			System.out.println("Terminamos de leer");
		}
		oos.close();

		return lista;
	}

}
