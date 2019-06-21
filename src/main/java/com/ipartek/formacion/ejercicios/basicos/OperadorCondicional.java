package com.ipartek.formacion.ejercicios.basicos;

public class OperadorCondicional {

	public static void main(String[] args) {
	int i = 8, j = 5, k;
	float x = 0.005F, y = -0.01F, z;
	char a, b = 'p', c = 'q';
	
	/* la variable resultado recibirá el valor1 en el caso de que la condición sea true o
	   bien el valor2 en el caso de que la condición sea false.
	
	*/
	System.out.println(k = (j == 5) ? i : j);
	System.out.println( k = (j > 5) ? i : j);
	System.out.println(z = (x >= 0) ? x : 0);
	System.out.println(z = (y >= 0) ? y : 0);
	System.out.println(a = (b < c) ? b : c);
	System.out.println(k = (j > 0) ? j : 0);
	System.out.println(k = (i > 0 && j > 0) ? 0 : 1);
	System.out.println(k = (y > 0 || x > 0) ? i+1 : i-1);
	System.out.println(a = (b < 'c') ? b : c);
	System.out.println(a = (b >= c) ? b : 'r');
	}
	
	
}
