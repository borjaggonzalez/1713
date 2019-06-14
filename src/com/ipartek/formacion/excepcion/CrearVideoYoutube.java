package com.ipartek.formacion.excepcion;

import java.util.Scanner;

import com.ipartek.formacion.Youtube;

public class CrearVideoYoutube {

	public static void main(String[] args) {
		System.out.println("------ Crear VIDEO YOUTUBE ------");
		System.out.println("---------------------------------");

		Scanner sc = new Scanner(System.in);
		boolean repetir = true;
		Youtube video= null;
		
		do {
		
	
		System.out.println("Titulo del video: recuerda longitud [2,150]");
		String titulo = sc.nextLine(); 

		System.out.println("Codigo del video: recuerda longitud [11]");
		String codigo = sc.nextLine(); 
		
		try {
			video = new Youtube(titulo, codigo);
			repetir = false;
		} catch (Exception e) {
			
			System.out.println("Error:" + e.getMessage());
			System.out.println("Intentalo  de nuevo, pro favor");
			
		}
	
		
		}while (repetir);
	
		System.out.println("Video Creado Correctamente");
		System.out.println(video);
		
		

		
		
		sc.close();

	}

}
