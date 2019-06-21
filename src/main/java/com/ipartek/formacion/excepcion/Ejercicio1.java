package com.ipartek.formacion.excepcion;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Comienza programa");
		int numero1=0;
		int numero2=0;
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		while (salir == false) {
			try {

				System.out.println("Por favor introduce un numero");
				String sNumero1 = sc.nextLine();// usar siempre mejor esto y no nextInt, nextChar
				numero1 = Integer.parseInt(sNumero1);
				salir = true;
				
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("****NO HAS INTRODUCIDO UN NUMERO****");
				salir = false;
			}

		}

		salir=false;
		while (salir == false) {

			try {

				System.out.println("Por favor introduce otro numero");
				String sNumero2 = sc.nextLine();
				numero2 = Integer.parseInt(sNumero2);
				salir = true;
			} catch (Exception e) {
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("****NO HAS INTRODUCIDO UN NUMERO****");
				salir = false;
			}
			
			
		}
		sc.close();
	
		int resultado=numero1+numero2;
		System.out.println("La suma de "+ numero1 +" + "+ numero2 +" es " + resultado );
		System.out.println("Finaliza programa");
	}
}
