package com.ipartek.formacion.practicaExamen;

public class Portatil extends Ordenador {
	public final int BATERIA_MAX = 100;
	public final int BATERIA_MIN = 20;

	float tamanioPantalla;
	int porcentajeBateria;

	public Portatil(String marca, String modelo, String placaBase, float cpu, int arquitectura, float tamanioPantalla,
			int inporcentajeBateria) throws Exception {
		super(marca, modelo, placaBase, cpu, arquitectura);
		this.setTamanioPantalla(tamanioPantalla);
		this.setPorcentajeBateria(porcentajeBateria);
	}

	public float getTamanioPantalla() {
		return tamanioPantalla;
	}

	public void setTamanioPantalla(float tamanioPantalla) {
		this.tamanioPantalla = tamanioPantalla;
	}

	public int getPorcentajeBateria() {
		return porcentajeBateria;
	}

	public void setPorcentajeBateria(int porcentajeBateria) throws Exception {

		if (porcentajeBateria > BATERIA_MAX) {
			throw new Exception("No puedes tener mas del 100% de bateria");
		} else if (porcentajeBateria <= BATERIA_MIN) {
			throw new Exception("Bateria Baja - Haz commit and push, ¡¡¡que se muere!!!");
		}

		this.porcentajeBateria = porcentajeBateria;
	}

	@Override
	public String toString() {
		return super.toString() + "Portatil [tamanioPantalla=" + tamanioPantalla + ", porcentajeBateria="
				+ porcentajeBateria + "]";
	}

}
