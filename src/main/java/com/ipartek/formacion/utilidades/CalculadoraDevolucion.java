package com.ipartek.formacion.utilidades;

public class CalculadoraDevolucion {

	public static final float[] BILLETES_MONEDAS = {
			// BILLETES
			500, 200, 100, 50, 20, 10, 5,
			// MONEDAS
			2, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

	/**
	 * Calcula las vueltas optimas para retornar el menor numero de billetes y
	 * monedas.
	 * 
	 * @param importe   float valor total de la compra.
	 * @param entregado float dinero entregado para comprar.
	 * @return int[] cantidad de billetes y monedas retornadas.
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws Exception importe > entregado o si importe o entregado es < 0
	 * 
	 */
	public static int[] vueltas(float importe, float entregado) throws Exception {
		// TODO vuestro marron, para que penseis
		if (importe < 0 || entregado < 0) {
			throw new Exception();
		}

		if (importe > entregado) {
			throw new Exception();
		}

		float devolucion = importe - entregado;
		int[] cantidad = new int[BILLETES_MONEDAS.length];
		if (devolucion < 0) {
			devolucion = devolucion * -1;
		}

		if (importe != entregado) {
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {

				while (devolucion >= BILLETES_MONEDAS[i]) {

					cantidad[i] = cantidad[i] + 1;
					devolucion = devolucion - BILLETES_MONEDAS[i];
				}

			}
		}
		
		/*********** SOLUCION DEL PROFESOR *************/
		/*
		 * float resto = entregado - importe;
		 * if(resto >0){
		 * 
		 * for (int i = 0; i < BILLETES_MONEDAS.length; i++) { result[i]=
		 * (int)(resto/BILLETES_MONEDAS[i]); 
		 * resto = resto % BILLETES_MONEDAS[i];
		 * 
		 * *******Redondear a 2 decimales, porque los float pierden.***********
		 * 
		 * resto = Math.round(resto*100.0f)/100.0f;
		 * } 
		 * }
		 * 
		 * 
		 */

		return cantidad;
	}

}
