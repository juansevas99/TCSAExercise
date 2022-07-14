package funcionalidades;

public class caminarLento  implements caminar_tipo{
	
	@Override
	public void ejecutar_caminar() {
		System.out.print("Estoy caminando lento");
		
		
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	
}
