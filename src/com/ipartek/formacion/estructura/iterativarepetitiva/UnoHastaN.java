package com.ipartek.formacion.estructura.iterativarepetitiva;

import java.util.Scanner;

public class UnoHastaN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduzca un numero:");
		n = sc.nextInt();
		sc.close();
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
		
		//System.out.println(Integer.MAX_VALUE);
	}
}
