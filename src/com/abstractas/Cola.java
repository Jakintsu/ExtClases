package com.abstractas;

public class Cola extends ColeccionSimple {

	@Override
	public void aniadir(Object o) {
		getLista().addLast(o);
	}

}
