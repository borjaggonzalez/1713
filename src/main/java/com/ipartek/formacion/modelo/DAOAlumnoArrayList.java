package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoArrayList implements ICrudAble<Alumno> {

	private static DAOAlumnoArrayList INSTANCE;
	private ArrayList<Alumno> lista;

	/**
	 * Encargado de devolver solo un objeto, patron Singleton
	 * 
	 * @return
	 */
	public static synchronized DAOAlumnoArrayList getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DAOAlumnoArrayList();
		}
		return INSTANCE;
	}

	/**
	 * Privado para que nadie pueda crear objetos
	 */
	private DAOAlumnoArrayList() {
		super();
		this.lista = new ArrayList<Alumno>();
	}

	@Override
	public List<Alumno> getAll() {
		return lista;
	}

	@Override
	public Alumno getById(int id) {
		Alumno resul = null;
		for (Alumno a : lista) {
			if (a.getId() == id) {
				resul = a;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean insert(Alumno pojo) {
		boolean resul = false;
		if (pojo != null) {
			resul = lista.add(pojo);
		}
		return resul;
	}

	@Override
	public boolean delete(int id) {

		boolean eliminado = false;

		if (id == -1) {
			eliminado = false;

		} else {
			lista.remove(getById(id));
			eliminado = true;

		}
		return eliminado;
	}

	@Override
	public boolean update(Alumno pojo) {
		boolean resul = false; 
		
		if ( pojo != null ) {
		
			for (Alumno a: lista) {
				
				if ( a.getId() == pojo.getId() ) {
					//modificar
					int pos = lista.indexOf(a);
					lista.set( pos , pojo);
					resul = true;
					break;
				}
			}
		}	
		
		
		return resul;
	}

	public ArrayList<Alumno> cargarAlumnos() {

		String[] lalumnos = { "Ander", "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eder I",
				"Eder S", "Gaizka", "Borja", "Verónica", "Jon A", "José Luis" };

		Alumno a;
		for (int i = 0; i < lalumnos.length; i++) {
			a = new Alumno(lalumnos[i]);
			a.setId(i + 1);
			lista.add(a);
		}

		return lista;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Alumno> pintarResul(ArrayList<Alumno> alumnos) {
		Collections.sort(alumnos);
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(i + 1 + " -" + alumnos.get(i).getNombre() + " " + alumnos.get(i).getNveces());

		}
		System.out.println("Alumnos totales: " + alumnos.size());
		return alumnos;
	}

}
