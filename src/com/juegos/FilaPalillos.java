package com.juegos;
/**
 * 
 * @author Gorka Elorduy
 * Clase que trata todo lo referente a una fila de palillos
 */
public class FilaPalillos {

	private int numPalillos;

	public FilaPalillos(int numPalillos) {
		super();
		this.numPalillos = numPalillos;
	}
	
	public boolean quitaPalillos(int cuantos) {
		boolean resultado = true;
		if(cuantos > numPalillos) {
			resultado = false;
		}else {
			numPalillos -= cuantos;
			resultado = true;
		}
		
		return resultado;
	}
	
	public void añadePalillos(int cuantos) {
		numPalillos += cuantos;
	}
	
	public int cuantosPalillos() {
		return numPalillos;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < numPalillos; i++) {
			s+="|";
			
		}
		
		return s;
	}
	
}
