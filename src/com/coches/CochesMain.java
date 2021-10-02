package com.coches;

import java.util.Scanner;

public class CochesMain {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Coche coche;
		String matricula;
		String respuesta;
		System.out.println("¿Cuál es la matrícula?");
		matricula = lector.nextLine();
		System.out.println("¿Tiene cambio automático?");
		respuesta = lector.nextLine();
		if(respuesta.charAt(0) == 's' || respuesta.charAt(0) == 'S') {
			coche = new CocheCambioAutomatico(matricula);
		}else {
			coche = new CocheCambioManual(matricula);
		}
		
		System.out.println(coche);
		coche.acelerar(50);
		if(coche instanceof CocheCambioManual) {
			coche.cambiaMarcha(3);
		}
		System.out.println(coche);
	}

}
