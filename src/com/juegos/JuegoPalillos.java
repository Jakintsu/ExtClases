package com.juegos;

/**
 * 
 * @author Gorka Elorduy Trata todo lo referente al juego
 *
 */
public class JuegoPalillos {

	private FilaPalillos[] filasPalillos;

	public JuegoPalillos(int[] palillos) {
		filasPalillos = new FilaPalillos[palillos.length];
		// Cada celda del array es un objeto de tipo FilaPalillos que hay que crear
		for (int i = 0; i < filasPalillos.length; i++) {
			filasPalillos[i] = new FilaPalillos(palillos[i]);
		}
	}

	public boolean quitarPalillos(int fila, int cuantos) throws Exception {
		boolean resultado = true;
		if (fila < 0 || fila >= filasPalillos.length) {
			throw new Exception("Número de filas no válido");
			
		} else {
			resultado = filasPalillos[fila].quitaPalillos(cuantos);
		}

		return resultado;
	}

	public boolean finJuego() {
		for (int i = 0; i < filasPalillos.length; i++) {
			if (filasPalillos[i].cuantosPalillos() != 0)
				return false;
		}
		return true;
	}

	public String toString() {
		String s = "";
		
		for(int i = 0; i < filasPalillos.length; i++) {
			s += (i+1) + " "+filasPalillos[i]+"\n";
		}
		
		return s;
	}
}
