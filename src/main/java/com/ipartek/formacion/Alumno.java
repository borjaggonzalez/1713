package com.ipartek.formacion;

import java.io.Serializable;

public class Alumno extends Person implements Comparable<Alumno>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  int nveces;

	public Alumno(String nombre) {
		super(nombre);
		super.setId(-1);
		this.setNveces(0);
	}
	
	public Alumno(String nombre, int veces) {
		super(nombre);
		this.nveces=0;
	}

	public int getNveces() {
		return nveces;
	}

	public void setNveces(int nveces) {
		this.nveces = nveces;
	}

	
	
	@Override
	public String toString() {
		return super.toString()+ "Alumno [nveces=" + nveces + "]";
	}

	@Override
	public int compareTo(Alumno o) {
		return o.getNveces() - this.nveces;
	}
	
	
	
	
	
}
