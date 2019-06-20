package com.ipartek.formacion;

public class Cerdos implements IOrdenable {
 private int kilos;
 private String nombre;
 
 
 
 
 
public Cerdos(int kilos, String nombre) {
	super();
	this.setKilos(kilos);
	this.setNombre(nombre);
}





public int getKilos() {
	return kilos;
}





public void setKilos(int kilos) {
	this.kilos = kilos;
}





public String getNombre() {
	return nombre;
}





public void setNombre(String nombre) {
	this.nombre = nombre;
}





@Override
public int getValor() {
	return this.kilos;
}
}
