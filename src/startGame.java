import personaje.*;
import motorJuego.constructorPersonaje;
public class startGame {
	public static void main (String [] args) {
		
		personaje personaje= new guardianes();
		constructorPersonaje constructor = new constructorPersonaje(personaje); 
		personaje.cambiarBoca("gruesa");
		personaje.cambiaContorno("punta");
		System.out.print(constructor.crearPersonaje());
		
		personaje.caminar().ejecutar_caminar();
		personaje.golpear().ejecutarGolpear();
		personaje.hablar().ejecutarHablar();
	}
}
