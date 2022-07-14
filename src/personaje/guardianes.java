package personaje;

import TraitFactory.TipoRasgo;
import TraitFactory.contruirBoca;
import TraitFactory.contruirNariz;
import TraitFactory.contruirOjo;
import funcionalidades.caminarRapido;
import funcionalidades.caminoMedio;
import funcionalidades.golpearArma;
import funcionalidades.golpear_limpio;
import funcionalidades.hablar_informal;
import funcionalidades.hablar_no;

public class guardianes extends personaje {
	public guardianes () {
		super();
		
		this.nombre="Guardianes";
		TipoRasgo tipoBoca=new contruirBoca() ;
		boca=tipoBoca.construirRasgo("pequena");
		
		TipoRasgo tipoOjo=new contruirOjo();
		ojos=tipoOjo.construirRasgo("japones");
		
		TipoRasgo tipoNariz=new contruirNariz() ;
		nariz=tipoNariz.construirRasgo("punta");
		
		
	// funcionalidades
		
		this.caminar=new caminoMedio();
		this.golpear= new golpear_limpio();
		this.hablar= new hablar_no();
		
		// guardar personaje
		
	}
	
	
	@Override
	public void añadirPersonaje() {
		this.listaPersonajes.add(new guardianes());
	}
}
