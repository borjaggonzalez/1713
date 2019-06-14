package com.ipartek.formacion;

import java.text.DecimalFormat;

public class PruebasPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		System.out.println(p.toString());

		Person p2 = new Person("Pepe", 24, 'h');
		System.out.println(p2);

		Employee e2 = new Employee("Manolito", 44, 'h', 1.200f);
		System.out.println(e2);
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");

		// Vamos a crear 3 personas famosas de Youtube

		Employee y1 = new Employee("Logan Paul", 23, 'h', 14500000f);
		Employee y2 = new Employee("PewDiePie", 23, 'h', 10500000f);
		Employee y3 = new Employee("Jacksepticeye", 23, 'h', 16000000f);

		Employee[] youtubers = new Employee[3];
		youtubers[0] = y1;
		youtubers[1] = y2;
		youtubers[2] = y3;
		DecimalFormat df = new DecimalFormat("#,###.## $");
		
		Employee emp=null; // decalarar fuera del for;
		for (int i = 0; i < youtubers.length; i++) {
			// posicion , nombre , salario
			// 1 , Logan, $14.500.000
			// System.out.println(youtubers[i]);
			emp=youtubers[i];
			System.out.println(i + 1 + "  " + emp.getNombre() + "  " + df.format(emp.getSalario()));

			//System.out.println(i + 1 + "  " + .getNombre() + "  " + df.format(youtubers[i].getSalario()));

		//foreach
		/*
		 *for(Employee empleado:youtubes){
		 *system.out.println(empleado);
		 *} 
		 */
		
			
		}
	}

}
