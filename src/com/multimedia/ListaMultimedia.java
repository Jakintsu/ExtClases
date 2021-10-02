package com.multimedia;

public class ListaMultimedia {

	private Multimedia[] lista;
	private int contador;

	public ListaMultimedia(int tamanioMaximo) {
		lista = new Multimedia[tamanioMaximo];
		contador = 0;
	}

	public int size() {
		return contador;
	}

	private boolean estaLlena() {
		return contador == lista.length;
	}

	public boolean add(Multimedia m) {
		if (estaLlena()) {
			return false;
		} else {
			lista[contador] = m;
			contador++;
			return true;
		}
	}

	public Multimedia obtener(int posicion) {
		if (posicion < 0 || posicion >= contador) {
			throw new IndexOutOfBoundsException("Posicion no válida");
		}
		return lista[posicion];
	}

	public int posicion(Multimedia m) {
		for (int i = 0; i < contador; i++) {
			if (m.equals(lista[i])) {
				return i;
			}

		}

		return -1;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < contador; i++) {
			s += lista[i].toString() + "\n\n";
		}
		return s;
	}
}
