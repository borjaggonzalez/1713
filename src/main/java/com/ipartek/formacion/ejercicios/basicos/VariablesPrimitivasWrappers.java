package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

/**
 * @author Curso
 * @see http://www.campus.formacion.ipartek.com/moodle/mod/page/view.php?id=882
 */
public class VariablesPrimitivasWrappers {

	public static void main(String[] args) {

		// Declarar todos los posibles tipos de variables primitivas que existen
		// Numeros enteros
		byte b = 5;
		short s = 4;
		int i = 0;
		long l = 8;

		//Numeros reales o con decimales
		float f = 2.43f;
		double d = 4.56;
		
		
		char c= 'a'; // comillas simples
		
		boolean b1 = true; //or false 
	
	//Wrappers
		int numeroParseado = Integer.parseInt("3");	
		System.out.printf("El rango de un int %d %d  \n \n", Integer.MIN_VALUE , Integer.MAX_VALUE);
		
		
		//Pedir numero por pantalla e indicar si es Mayuscula o Minusculas, Letra o Numero.
		
		System.out.println("Por favor introduce un caracter:");
		Scanner sc = new Scanner(System.in);
		char caracter =sc.next().charAt(0);
		System.out.println("Has escrito " + caracter );
	boolean	letra =  Character.isLetter(caracter);
	boolean mayus =	 Character.isUpperCase(caracter);
	boolean minus = Character.isLowerCase(caracter);
	boolean simbolo = Character.isLetterOrDigit(caracter);

	//Respuesta del profesor
	//System.out.println(Character.isLetter(caracter)? "Es Letra": "No es letra");
	//System.out.println(Character.isDigit(caracter)? "Es Numero": "No es numero");
	//System.out.println(Character.isLowerCase(caracter)? "Es Minuscula": "No es Minuscula");
	//System.out.println(Character.isUpperCase(caracter)? "Es Mayuscula": "No es Mayuscula");
	//System.out.println(Character.isLetterOrDigit(caracter)? "": "Es un caracter especial");
	/***********************************************************/
	
	if(simbolo==false) {
		System.out.println("El caracter que has escrito es un simbolo");
	}else if ( letra == true) {
		System.out.printf("El caracter que has escrito es una letra");
		if(mayus == true) {
		System.out.printf(" y es una letra mayuscula");
		
		}else {
		System.out.printf(" y es una letra  minuscula");
		}
	}else{
	
		System.out.println("El caracter que has escrito es un numero");
	}
		
		
		sc.close();
		
	}

}
