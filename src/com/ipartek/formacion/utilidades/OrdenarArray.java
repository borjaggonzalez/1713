package com.ipartek.formacion.utilidades;

public class OrdenarArray {
/**
 * Ordenar array de numeros del menor al mayor metodo BubbleShort
 * @param numeros[] arrary numeros a ordenar 
 * @return array ordenado
 * @exception Excepcion si numeros == null
 */
	public static int[] ordenarArray(int[] numeros) throws Exception{

		if(numeros==null) {
			throw new Exception("No puede ser null");
		}
		
		int aux;

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 1; j < numeros.length; j++) {
				if (numeros[j - 1] > numeros[j]) {
					aux = numeros[j - 1];
					numeros[j - 1] = numeros[j];
					numeros[j] = aux;
				}

			}

		}

		return numeros;
	}

}
