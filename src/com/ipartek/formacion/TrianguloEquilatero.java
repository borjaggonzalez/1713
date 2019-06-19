package com.ipartek.formacion;

public class TrianguloEquilatero extends Triangulo{

	@Override
	public void dibujar(String color) {
		color= "Rojo";
		System.out.println(color);
		
	}

	@Override
	public void tipoTriangulo(String tipo) {
		tipo = "Equilatero";
				System.out.println(tipo);
		
	}

}
