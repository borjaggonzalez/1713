package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void sumar() {
		// fail("Not yet implemented");
		int resultado = Calculadora.sumar(2, 3);
		assertEquals("No suma bien ",5 , resultado);

	}

	@Test
	public void restar() {
		
		assertEquals("No resta bien ",0 , Calculadora.restar(2,2));
		assertEquals("No resta bien ",1 , Calculadora.restar(3,2));
		assertEquals("No resta bien ",-1 , Calculadora.restar(2,3));
		
	}

	@Test
	public void multiplicar() {
		assertEquals("No multiplica bien ",4 , Calculadora.multiplicar(2,2));
		assertEquals("No multiplica bien ",0 , Calculadora.multiplicar(2,0));
		assertEquals("No multiplica bien ",0 , Calculadora.multiplicar(0,2));
		assertEquals("No multiplica bien ",-4 , Calculadora.multiplicar(-2,2));
	
	}

	@Test (expected = ArithmeticException.class)
	public void divir() {
		assertEquals("No divide bien ",0 , Calculadora.dividir(0,2));
		assertEquals("No divide bien ",5 , Calculadora.dividir(10,2));
		assertEquals("No divide bien ",-5 , Calculadora.dividir(10,-2));
		
		Calculadora.dividir(2,0);	
	}
	
	
}
