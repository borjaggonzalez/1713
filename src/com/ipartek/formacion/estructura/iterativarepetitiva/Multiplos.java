package com.ipartek.formacion.estructura.iterativarepetitiva;


import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, m;
		
		do {
			System.out.println("Introduce un numero positivo");
			n = sc.nextInt();
			Character s = (char)n;
			if(Character.isLetter(s)) {
				System.out.println("Debes introducir un numero entero positivo");
			}else if (n <= 0) {
				System.out.println("Debes introducir un numero entero positivo");
			}

		} while (n <= 0);
		do {
			System.out.println("Introduce otro numero entero positivo mayor que " + n);
			m = sc.nextInt();
			if (m <= 0) {
				System.out.println("Debes introducir un numero positivo");
			} else if (m <= n) {
				System.out.println("Deebes introducir un numero mayor que " + n);
			}

		} while (m <= 0 || m <= n);
		
		sc.close();
		
		System.out.println("Estos son los multiplos de "+ n + " desde 1 hasta "+m);
		for(int i=1; i<=m; i++) {
			if(i % n==0){
				System.out.println(i);
			}
		}
		
	}

}
