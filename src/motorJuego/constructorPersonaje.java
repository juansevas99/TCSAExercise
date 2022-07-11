package motorJuego;

import personaje.personaje;

public class constructorPersonaje {
	personaje personaje;
	public constructorPersonaje(personaje personaje) {
		this.personaje=personaje;
	}
	public  String crearPersonaje() {
		String cadena="";
		
		// cara
		cadena+=personaje.getContorno().getDibujo()+"\n";
		cadena+="  "+personaje.getOjos().getDibujo()+"\n";
		cadena+="  "+personaje.getNariz().getDibujo()+"\n";
		cadena+="  "+personaje.getBoca().getDibujo()+"\n";
		return cadena;
	}
}
