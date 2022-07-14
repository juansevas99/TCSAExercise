import personaje.*;

import java.util.Scanner;

import motorJuego.constructorPersonaje;
public class startGame {
	public static void main (String [] args) {
		Scanner entrada= new Scanner(System.in);
		personaje personaje1= new Guerreros();
		personaje1.añadirPersonaje();
		personaje personaje2= new ciudadanos();
		personaje2.añadirPersonaje();
		personaje personaje3= new guardianes();
		personaje3.añadirPersonaje();
		constructorPersonaje constructor;
		System.out.println("Bienvenido. Este es un juego de perfiles, Porfavor ingrese cualquier tecla y empezara!!");
		
		if (entrada.nextLine()!=null) {
			int opcion;
			try {
				System.out.println("1. Escoger Personaje");
				System.out.println("2. Salir");
				
				opcion=entrada.nextInt();
					
				switch(opcion) {
					case 1:
						System.out.println("Escoja los personajes habilitados");
						int i=1;
						System.out.println(personaje.getPersonajes().get(0)); 
						for (personaje p : personaje.getPersonajes()) {
							System.out.println(i+ " : "+ p.toString());
							i++;
							
						}
						int opcionJugador=entrada.nextInt();
						if (opcionJugador<personaje.getPersonajes().size()) {
								
							personaje escogido=personaje.getPersonajes().get(opcionJugador-1);
							System.out.println("Personaje escogido:"+escogido.toString());
							constructor = new constructorPersonaje(escogido); 
							System.out.print(constructor.crearPersonaje());
							
							escogido.caminar().ejecutar_caminar();
							escogido.golpear().ejecutarGolpear();
							escogido.hablar().ejecutarHablar();
							
							
							System.out.println("\n "
									+ "Que desea cambiar"
									+ "\n 1. Cambiar contorno"
									+ "\n 2. Cambiar ojos"
									+ "\n 3. Cambiar Nariz"
									+ "\n 4. Cambiar Boca");
							
							
							int opcionTraits= entrada.nextInt();
							switch(opcionTraits) {
							case 1:
								System.out.println("Que tipo de contorno quiere"
										+ "\n 1. Curvo"
										+ "\n 2. Punta"
										+ "\n 3. Recto");
										int opcionTipoRasgo= entrada.nextInt();
										
										switch(opcionTipoRasgo) {
											case 1:
												escogido.cambiaContorno("Curvo");
											break;
											case 2:
												escogido.cambiaContorno("Punta");
											break;
											case 3:
												escogido.cambiaContorno("Recto");
											break;
										}
								break;
							case 2:
								break;
							case 3:
								break;
							case 4:
								break;
							case 5:
								break;
							default:
								
							}
							
							System.out.print(constructor.crearPersonaje());
						}
						
						
					break;
					
					case 2:
						System.out.println("Saliendo del sistema");
					break;
					default: 
						System.out.println("Opcion no existe");
				}
			}
			
			
			catch(Exception e) {
				System.out.println("Algo salio mal!"+e.toString());
			}
			
			
		}
		
		
		
		
		
	}
}
