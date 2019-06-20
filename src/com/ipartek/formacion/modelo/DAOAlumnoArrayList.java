package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoArrayList implements ICrudAble<Alumno> {

	private ArrayList<Alumno> lista;

	public DAOAlumnoArrayList() {
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

		return lista.add(pojo);
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
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Alumno> CargarAlumnos() {

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

}
