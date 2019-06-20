package com.ipartek.formacion;

public class Alumno extends Person implements Comparable<Alumno>{

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
	public int compareTo(Alumno o) {
		return o.getNveces() - this.nveces;
	}
	
	
	
	
	
}
