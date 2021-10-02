package com.abstractas;

import java.util.LinkedList;

public abstract class ColeccionSimple {
	private LinkedList<Object> lista;
	
	public ColeccionSimple() {
		lista = new LinkedList<Object>();
	}

	public abstract void aniadir(Object o);
	
	public Object extraer() {
		return lista.removeFirst();
	}
	
	public boolean estaVacia() {
		return lista.isEmpty();
	}
	
	public Object primero() {
		return lista.getFirst();
	}
	
	public String toString() {
		return lista.toString();
	}
	
	protected LinkedList<Object> getLista(){
		return lista;
	}
}
