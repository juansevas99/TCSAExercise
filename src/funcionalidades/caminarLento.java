package funcionalidades;

public class caminarLento  implements caminar_tipo{
	int velocidad=1;
	@Override
	public void ejecutar_caminar() {
		System.out.print("Estoy caminando lento");
		
	}
	
}
