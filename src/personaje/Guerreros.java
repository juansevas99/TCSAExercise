package personaje;


import TraitFactory.*;

public class Guerreros  extends personaje{	
	public Guerreros() {
		super();
		TipoRasgo tipoBoca=new contruirBoca() ;
		boca=tipoBoca.construirRasgo("pequena");
		
		TipoRasgo tipoOjo=new contruirOjo();
		ojos=tipoOjo.construirRasgo("japones");
		
		TipoRasgo tipoNariz=new contruirNariz() ;
		nariz=tipoNariz.construirRasgo("larga");
		
		TipoRasgo tipoContorno=new contruirContorno() ;
		contorno=tipoContorno.construirRasgo("curvo");
	}
	
	
}
