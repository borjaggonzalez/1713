package com.ipartek.formacion.practicaExamen;

public class Ordenador {
	public final int X86 = 32;
	public final int X64 = 64;

	String marca;
	String modelo;
	String placaBase;
	float cpu;
	int arquitectura;

	public Ordenador(String marca, String modelo, String placaBase, float cpu, int arquitectura) {
		super();

		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPlacaBase(placaBase);
		this.setCpu(cpu);
		this.setArquitectura(arquitectura);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public int getArquitectura() {
		return arquitectura;
	}

	public void setArquitectura(int arquitectura) {
		this.arquitectura = arquitectura;
	}

	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", placaBase=" + placaBase + ", cpu=" + cpu
				+ ", arquitectura=" + arquitectura + "]";
	}

}
