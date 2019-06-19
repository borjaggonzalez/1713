package com.ipartek.formacion;

public class Person implements IAmigable {

	// atributos


	private String nombre;
	private int edad;
	private float altura; // 1.70 metros
	private float peso; // 50.5 kg
	private String ojos; // color;
	private char sexo; // 'h' hombre, 'm' mujer, 'i' indefinido

	

	public Person() {
		super();
		nombre = "Anonimo";
		edad = 18;
		altura = 0;
		peso = 0;
		ojos="Marrones";
		sexo = 'i';
		
	}

	

	public Person(String nombre, int edad, char sexo) {
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Person(String nombre) {
		this();
		this.setNombre(nombre);
	
	}
	
	
	public String saludar() {

		return "Hola me llamo " + getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			this.nombre = "Sin Nombre";
		} else {
			this.nombre = nombre;
		}

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String despedir() {
		
		return "Agur venur";
	}

	
	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", ojos="
				+ ojos + ", sexo=" + sexo + "]";
	}




}
