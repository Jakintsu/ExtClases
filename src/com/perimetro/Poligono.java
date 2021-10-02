package com.perimetro;

public class Poligono {

	private Punto[] vertices;

	public Poligono(Punto[] vertices) {
		if (vertices.length < 3) {
			throw new IllegalArgumentException("Numero de vertices no adecuado");
		}
		this.vertices = vertices;
	}

	public void escalar(double x, double y) {
		double valX, valY;
		for (Punto p : vertices) {
			valX = p.getX();
			valY = p.getY();
			p.setX(valX * x);
			p.setY(valY * y);
		}
	}

	public void trasladar(double x, double y) {
		double valX, valY;
		for (Punto p : vertices) {
			valX = p.getX();
			valY = p.getY();
			p.setX(valX + x);
			p.setY(valY + y);
		}
	}

	public int numeroVertices() {
		return vertices.length;
	}

	public double perimetro() {
		double perimetro = 0D;
		for (int i = 0; i < vertices.length - 1; i++) {
			perimetro += vertices[i].distancia(vertices[i + 1]);
		}

		perimetro += vertices[0].distancia(vertices[vertices.length - 1]);

		return Math.round(perimetro*100)/100d;
	}

	public String toString() {
		String cadena = "";
		for (Punto punto : vertices) {
			cadena += punto + "\n";
		}

		return cadena;
	}
}
