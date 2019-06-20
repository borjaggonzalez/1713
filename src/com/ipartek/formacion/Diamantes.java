package com.ipartek.formacion;

public class Diamantes implements IOrdenable {
 private int kilates;
 private String color;
 
 
 
 
public Diamantes(int kilates, String color) {
	super();
	this.setKilates(kilates); 
	this.setColor(color);
}




public int getKilates() {
	return kilates;
}




public void setKilates(int kilates) {
	this.kilates = kilates;
}




public String getColor() {
	return color;
}




public void setColor(String color) {
	this.color = color;
}




@Override
public int getValor() {
	return this.kilates;
}
}
