package personaje;

import TraitFactory.TipoRasgo;
import TraitFactory.contruirBoca;
import TraitFactory.contruirNariz;
import TraitFactory.contruirOjo;
import funcionalidades.caminarLento;
import funcionalidades.caminoMedio;
import funcionalidades.golpear_limpio;
import funcionalidades.golpear_no;
import funcionalidades.hablar_informal;
import funcionalidades.hablar_no;

public class ciudadanos  extends personaje{
	public ciudadanos() {
		super();
		
		this.nombre="Cuidadanos";
		TipoRasgo tipoBoca=new contruirBoca() ;
		boca=tipoBoca.construirRasgo("pequena");
		
		TipoRasgo tipoOjo=new contruirOjo();
		ojos=tipoOjo.construirRasgo("japones");
		
		TipoRasgo tipoNariz=new contruirNariz() ;
		nariz=tipoNariz.construirRasgo("delgada");
		
	// funcionalidades
		
		this.caminar=new caminarLento();
		this.golpear= new golpear_no();
		this.hablar= new hablar_informal();
		
		// guardar Personaje
		
	}
	
	@Override
	public void añadirPersonaje() {
		this.listaPersonajes.add(new ciudadanos());
	}
}
