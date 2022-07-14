package funcionalidades;

public class caminarRapido implements caminar_tipo{
	int velocidad=5;

	@Override
	public void ejecutar_caminar() {
		System.out.print("Estoy caminando muy rapido!!");
		
	}

}
