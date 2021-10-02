package com.coches;

public class CocheCambioAutomatico extends Coche {

	public CocheCambioAutomatico(String matricula) {
		super(matricula);
	}

	@Override
	public void acelerar(int cuanto) {
		super.acelerar(cuanto);
		if (getVelocidad() < 10) {
			cambiaMarcha(1);
		} else if (getVelocidad() < 30) {
			cambiaMarcha(2);
		} else if (getVelocidad() < 50) {
			cambiaMarcha(3);
		} else if (getVelocidad() < 80) {
			cambiaMarcha(4);
		} else {
			cambiaMarcha(5);
		}

	}

	@Override
	public void frenar(int cuanto) {
		super.frenar(cuanto);
		if (getVelocidad() < 5) {
			cambiaMarcha(1);
		} else if (getVelocidad() < 20) {
			cambiaMarcha(2);
		} else if (getVelocidad() < 40) {
			cambiaMarcha(3);
		} else if (getVelocidad() < 60) {
			cambiaMarcha(4);
		} else {
			cambiaMarcha(5);
		}
	}
}
