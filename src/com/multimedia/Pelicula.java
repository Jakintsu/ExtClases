package com.multimedia;

public class Pelicula extends Multimedia{
	
	private String actorPrincipal;
	private String actrizPrincipal;

	public Pelicula(String titulo, String autor, Formato formato, double duracion, String actriz, String actor) {
		super(titulo, autor, formato, duracion);
		if(actor == null && actriz == null) {
			throw new IllegalArgumentException("Tiene que haber al menos un protagonista");
		}
		actrizPrincipal = actriz;
		actorPrincipal = actor;
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}
	
	public String toString() {
		String s = "Protagonizado por: ";
		if(actrizPrincipal!=null) {
			s+=actrizPrincipal;
			if(actorPrincipal != null) {
				s+=" y " + actorPrincipal;
			}
		}else {
			assert actorPrincipal != null;
			s+=actorPrincipal;
		}
		
		return super.toString() + s;
	}

}
