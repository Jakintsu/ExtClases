package com.coches;

public class Coche {

	private String matricula;
	private double velocidad;
	private int marcha;

	public Coche(String matricula) {
		this.matricula = matricula;
		velocidad = 0;
		marcha = 0;
	}

	public String getMatricula() {
		return matricula;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public int getMarcha() {
		return marcha;
	}

	public void acelerar(int cuanto) {
		// Si el parámetro es negativo se cambia de signo y se llama a frenar
		if (cuanto < 0) {
			frenar(-cuanto);
		} else {
			velocidad += cuanto;
		}
	}

	public void frenar(int cuanto) {
		if (cuanto < 0) {
			acelerar(-cuanto);
		} else {
			velocidad -= cuanto;
			// Si el parámetro es mayor que la velocidad, esta se pone a cero
			if (velocidad < 0) {
				velocidad = 0;
			}
		}

	}

	protected void cambiaMarcha(int marcha) {
		this.marcha = marcha;
	}

	public String toString() {
		return "Matrícula: " + matricula + "\nVelocidad: " + velocidad + "\nMarcha: " + marcha;
	}
}
