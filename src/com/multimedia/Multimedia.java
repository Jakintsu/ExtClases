package com.multimedia;

public class Multimedia {

	private String titulo;
	private String autor;
	private Formato formato;
	private double duracion;

	public Multimedia(String titulo, String autor, Formato formato, double duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		return "Título: " + titulo + " De: " + autor + "\n" + "Formato: " + formato + " Duracion: " + duracion;
	}

	public boolean equals(Multimedia m) {
		return titulo.equals(m.getTitulo()) && autor.equals(m.getAutor());
	}

}
