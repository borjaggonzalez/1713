package com.ipartek.formacion.practicaExamen;

import java.util.Scanner;

public class MenuOrdenador {
	static final int OPCION_CREAR = 1;
	static final int OPCION_LISTAR = 2;
	static final int OPCION_BORRAR = 3;
	static final int OPCION_ORDENADOR = 1;
	static final int OPCION_PORTATIL = 2;
	static Scanner sc;
	static String modelo = "";
	static String marca = "";
	static String placaBase = "";
	static float cpu = 0;
	static int arquitectura = 0;
	static float tamanioPantalla = 0;
	static int porcentajeBateria = 0;
	
	
	
	
	
	public static void main(String[] args) throws Exception {

		System.out.println("Que quieres hacer:");
		System.out.println("1- Crear");
		System.out.println("2- Listar");
		System.out.println("3- Borrar");
		int op1;
		sc = new Scanner(System.in);
		op1 = Integer.parseInt(sc.nextLine().trim());

		switch (op1) {
		case OPCION_CREAR:
			crearDispositivo();
			break;

		case OPCION_LISTAR:

			break;

		case OPCION_BORRAR:

			break;
		default:
			break;
		}

		sc.close();
	}

	private static void crearDispositivo() throws Exception {
		int op2;
		System.out.println("Que quieres crear:");
		System.out.println("1-Ordenador");
		System.out.println("2-Portatil");
		Scanner sc = new Scanner(System.in);

		op2 = Integer.parseInt(sc.nextLine().trim());

		switch (op2) {
		case OPCION_ORDENADOR:
			crearOrdenador();
			break;

		case OPCION_PORTATIL:
			crearPortatil();
			break;

		default:
			break;
		}

	}

	private static void crearOrdenador() {
		

		System.out.println("Introduce la marca del portatil:");
		marca = sc.nextLine();

		System.out.println("Introduce el modelo:");
		modelo = sc.nextLine();

		System.out.println("Introduce la placabase:");
		placaBase = sc.nextLine();

		System.out.println("Introduce la velocidad de la cpu:");
		cpu = Float.parseFloat(sc.nextLine());

		System.out.println("Introduce la arquitectura:");
		arquitectura = Integer.parseInt(sc.nextLine().trim());

		Ordenador pc = new Ordenador(marca, modelo, placaBase, cpu, arquitectura);
		System.out.println(pc.toString());
			
	}
	
	
	

	private static void crearPortatil() throws Exception {
		System.out.println("Introduce la marca del portatil:");
		marca = sc.nextLine();

		System.out.println("Introduce el modelo:");
		modelo = sc.nextLine();

		System.out.println("Introduce la placabase:");
		placaBase = sc.nextLine();

		System.out.println("Introduce la velocidad de la cpu:");
		cpu = Float.parseFloat(sc.nextLine());

		System.out.println("Introduce la arquitectura (32 o 64):");
		arquitectura = Integer.parseInt(sc.nextLine().trim());
		
		System.out.println("Introduce la velocidad de la tamanio pantalla:");
		tamanioPantalla = Float.parseFloat(sc.nextLine());

		System.out.println("Introduce el porcentaje de bateria:");
		porcentajeBateria = Integer.parseInt(sc.nextLine().trim());
		
		
		Portatil lp = new Portatil(marca, modelo, placaBase, cpu, arquitectura, tamanioPantalla, porcentajeBateria);
		System.out.println(lp.toString());
	}

}
