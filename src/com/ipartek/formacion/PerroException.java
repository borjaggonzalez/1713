package com.ipartek.formacion;
/**
 * Excepcion personalizada para el POJO del Perro
 *
 * @author Curso
 *
 */
public class PerroException extends Exception {

	private static final long serialVersionUID = 1L;

	public static final String ERROR_EDAD = "La edad debe ser mayor que 0";
	
	public PerroException(String error) {
		super(error);
	}
}
