package com.abstractas;

public class PIla extends ColeccionSimple {

	@Override
	public void aniadir(Object o) {
		getLista().addFirst(o);
	}

}
