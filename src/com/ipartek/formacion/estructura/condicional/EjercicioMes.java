package com.ipartek.formacion.estructura.condicional;

import java.util.Scanner;

public class EjercicioMes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes;

		System.out.println("Introduzca el numero de un mes:");
		mes = sc.nextInt();
		sc.close();
		
		if (mes > 1 || mes < 12) {

			switch (mes) {
			case 1:
				System.out.printf("ENERO");

				break;
			case 2:
				System.out.printf("FEBRERO");

				break;
			case 3:
				System.out.printf("MARZO");

				break;
			case 4:
				System.out.printf("ABRIL");

				break;
			case 5:
				System.out.printf("MAYO");

				break;
			case 6:
				System.out.printf("JUNIO");

			case 7:
				System.out.printf("JULIO");

				break;
			case 8:
				System.out.printf("AGOSTO");

				break;
			case 9:
				System.out.printf("SEPTIEMBRE");

				break;
			case 10:
				System.out.printf("OCTUBRE");

				break;
			case 11:
				System.out.printf("NOVIEMBRE");

				break;
			case 12:
				System.out.printf("DICIEMBRE");

				break;

			}
			
			sc.close();
			
			
		} else {
			System.out.println("El numero de mes introducido no es valido");
		}

		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println(" tiene 30 dias");
		}else if(mes == 2){
			System.out.println(" tiene 28 dias");
		}else {
			System.out.println(" tiene 31 dias");
		}
		
	}// fin del void

}
