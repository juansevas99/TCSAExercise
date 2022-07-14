package personaje;


import TraitFactory.*;
import funcionalidades.caminarRapido;
import funcionalidades.golpearArma;
import funcionalidades.hablar_informal;

public class Guerreros  extends personaje{	
	public Guerreros() {
		super();
		
		//rasgos de guerrro
		TipoRasgo tipoBoca=new contruirBoca() ;
		boca=tipoBoca.construirRasgo("pequena");
		
		TipoRasgo tipoOjo=new contruirOjo();
		ojos=tipoOjo.construirRasgo("japones");
		
		TipoRasgo tipoNariz=new contruirNariz() ;
		nariz=tipoNariz.construirRasgo("larga");
		
		TipoRasgo tipoContorno=new contruirContorno() ;
		contorno=tipoContorno.construirRasgo("curvo");
		
		
		// funcionalidades
		
		this.caminar=new caminarRapido();
		this.golpear= new golpearArma();
		this.hablar= new hablar_informal();
	}
	
	
	
	
}
