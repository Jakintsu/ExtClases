package com.perimetro;

public class PruebaMain {

	public static void main(String[] args) {
		Punto[] vertices = { new Punto(), new Punto(2, 5), new Punto(3, 8), new Punto(8, 9) };
		
		Poligono miPoligono;
		miPoligono = new Poligono(vertices);
		System.out.println(miPoligono);
		System.out.println("Perímetro: "+miPoligono.perimetro());
		//Aquí no hay cambios
		miPoligono.trasladar(15000, -30000);
		System.out.println(miPoligono.perimetro());
	}
}
