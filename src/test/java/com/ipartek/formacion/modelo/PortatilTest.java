package com.ipartek.formacion.modelo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.practicaExamen.Portatil;

public class PortatilTest {
	public final int BATERIA_MAX = 100;
	public final int BATERIA_MIN = 20;
	public final int X86 = 32;
	public final int X64 = 64;
	
	static Portatil p;
	
	String marca = "Toshiba";
	String modelo = "Satellite";
	String placaBase= "Nimbus 2000";
	float cpu = 40.5f;
	int arquitectura = X64;
	float tamanioPantalla = 17.5f;
	int porcentajeBateria= 100;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p = new Portatil(marca, modelo, placaBase, cpu, arquitectura, tamanioPantalla, porcentajeBateria);
		p.setMarca(marca);
		p.setModelo(modelo);
		p.setPlacaBase(placaBase);
		p.setCpu(cpu);
		p.setArquitectura(arquitectura);
		p.setTamanioPantalla(tamanioPantalla);
		p.setPorcentajeBateria(porcentajeBateria);
	
	}

	@After
	public void tearDown() throws Exception {
		Portatil p = null;
	}

	@Test
	public void testGetTamanioPantalla() {
		assertEquals(17.5f, p.getTamanioPantalla(),0.001);
	}

	@Test
	public void testSetTamanioPantalla() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPorcentajeBateria() {
		fail("Not yet implemented");
	}

	@Test (expected = Exception.class)
	public void testSetPorcentajeBateria()  throws Exception{
		
		assertEquals(100, p.getPorcentajeBateria());
		
		p.setPorcentajeBateria(50);
		assertEquals(50, p.getPorcentajeBateria());
		
		p.setPorcentajeBateria(BATERIA_MIN);
	
		
	}
	
	@Test (expected = Exception.class)
	public void testSetPorcentajeBateriaCero()  throws Exception{
		
		p.setPorcentajeBateria(0);
		
	}
	
	@Test (expected = Exception.class)
	public void testSetPorcentajeBateriaMayorMax()  throws Exception{
		
			p.setPorcentajeBateria(BATERIA_MAX+10);
		
	}

	@Test
	public void testGetMarca() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMarca() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetModelo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetModelo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPlacaBase() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPlacaBase() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCpu() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCpu() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetArquitectura() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetArquitectura() {
		fail("Not yet implemented");
	}

}
