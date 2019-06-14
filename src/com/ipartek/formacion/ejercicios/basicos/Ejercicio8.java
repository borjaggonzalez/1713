package com.ipartek.formacion.ejercicios.basicos;

/**
 * 
 * @author Borja Garcia
 * @see http://puntocomnoesunlenguaje.blogspot.com/2012/10/java-ejercicios-iniciales-3.html
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		

		/*
		 
		  Escribe un programa java que declare una variable A de tipo entero y asígnale
		  un valor. A continuación muestra un mensaje indicando si A es par o impar.
		  Utiliza el operador condicional ( (condicion)? <TRUE> : <FALSE> ) dentro del println para resolverlo.
		  
		  Si por ejemplo A = 14 la salida será 14 es par
	      
	      Si fuese por ejemplo A = 15 la salida será: 15 es impar.
		  
		 */
		final String NOMBRE_EJERCICIO = "Ejercicio 8"; //Constante
				System.out.println(NOMBRE_EJERCICIO);
		int a = 14;
		int b=15;
		System.out.println(a +(a % 2 == 0 ? " Es Par ":" Es Impar "));
		//System.out.printf("El numero %s es %s", b ,(b % 2 == 0) ? " Par ":" Impar ");
		String resultado = ((b % 2 == 0) ? " Par ":" Impar ");
		System.out.printf("El numero %s es %s", b , resultado);
		
		float numero  = 4.1425936363f;
		float numero2 = (float)4.1425936363;
		float numero3 =3;
		
		double numeroDouble = 4.1425936363;
		
		System.out.printf("Numero formateado con 2 decimales %.2f", numero);
		System.out.printf("Numero formateado con 2 decimales %.2f", numero2);
		System.out.printf("Numero formateado con 2 decimales %.2f", numero3);
		
		System.out.printf("Numero formateado con 2 decimales %.2f", numeroDouble);
		
		
		
	}

}
