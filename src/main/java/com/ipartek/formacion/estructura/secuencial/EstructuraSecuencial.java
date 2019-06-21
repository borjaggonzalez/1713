package com.ipartek.formacion.estructura.secuencial;
import java.util.*;

public class EstructuraSecuencial {
	public static void main(String[] args) {
		 	 	
		/*
		 *
		 * N = 12345    La salida debe ser:
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		        Scanner sc = new Scanner(System.in);
		        int N;
		        System.out.print("Introduzca valor de N: ");
		        N = sc.nextInt(); //supondremos que el número introducido tiene 5 cifras
		        System.out.println(N/10000);
		        System.out.println(N/1000);
		        System.out.println(N/100);
		        System.out.println(N/10);
		        System.out.println(N);
		        
		        
		        /*
		        *
		        * N = 12345    La salida debe ser:
		        * 5
		        * 45
		        * 345
		        * 2345
		        * 12345
		        */
		        
		        
		         
		            System.out.print("Introduzca valor de N: ");
		            N = sc.nextInt();  //supondremos que el número introducido tiene 5 cifras
		            System.out.println(N%10);
		            System.out.printf("%02d %n",N%100);
		            System.out.printf("%03d %n",N%1000);
		            System.out.printf("%04d %n",N%10000);
		            System.out.printf("%05d %n",N);
		   sc.close();
		}
	
}

		
		
		
		

