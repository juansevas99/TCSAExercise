package personaje;

import TraitFactory.TipoRasgo;
import TraitFactory.contruirBoca;
import TraitFactory.contruirNariz;
import TraitFactory.contruirOjo;

public class ciudadanos  extends personaje{
	public ciudadanos() {
		super();
		TipoRasgo tipoBoca=new contruirBoca() ;
		boca=tipoBoca.construirRasgo("pequena");
		
		TipoRasgo tipoOjo=new contruirOjo();
		ojos=tipoOjo.construirRasgo("japones");
		
		TipoRasgo tipoNariz=new contruirNariz() ;
		nariz=tipoNariz.construirRasgo("delgada");
	}
}
