package com.juegos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner lector = new Scanner(System.in);
		int[] palillos = {7, 8, 9};
		
		JuegoPalillos juego = new JuegoPalillos(palillos);
		String[] jugador = new String[2];
		jugador[0] = "Jugador 1";
		jugador[1] = "Jugador 2";
		int turno = 0;
		int fila;
		int cuantos;
		
		do {
			try {
				System.out.println(juego);
				System.out.println(jugador[turno]+ " elige fila");
				fila = lector.nextInt();
				System.out.println(jugador[turno]+" ¿cuantos palillos quieres quitar? ");
				cuantos = lector.nextInt();
				if(juego.quitarPalillos(fila, cuantos)) {
					turno = (turno + 1)%2; //Para cambiar de turno
				}else {
					System.out.println("Introduce bien la fila y/o el número de palillos");
				}
				}catch(InputMismatchException exception) {
					System.out.println("Introduce bien el dato.");
					lector.next();
				}finally {
					lector.close();
				}
			}while(!juego.finJuego());
		System.out.println("El ganador ha sido : " + jugador[turno]);
		}
}


