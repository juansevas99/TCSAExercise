import personaje.*;
import motorJuego.constructorPersonaje;
public class startGame {
	public static void main (String [] args) {
		
		personaje personaje= new Guerreros();
		constructorPersonaje constructor = new constructorPersonaje(personaje); 
		personaje.cambiarBoca("gruesa");
		personaje.cambiaContorno("punta");
		System.out.print(constructor.crearPersonaje());		
	}
}
