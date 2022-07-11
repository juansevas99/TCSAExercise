package funcionalidades;

public class caminoMedio implements caminar_tipo{
	int velocidad=2;

	@Override
	public void ejecutar_caminar() {
		System.out.print("Estoy caminando medio rapido");
		
	}
	
}
