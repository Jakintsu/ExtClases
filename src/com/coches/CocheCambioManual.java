package com.coches;

public class CocheCambioManual extends Coche {

	public CocheCambioManual(String matricula) {
		super(matricula); //LLamada al constructor de la superclase
	}
	
	@Override
	public void cambiaMarcha(int marcha) {
		if(marcha < 0) {
			throw new IllegalArgumentException();
		}
		super.cambiaMarcha(marcha);
	}

}
