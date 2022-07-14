package personaje;
import TraitFactory.TipoRasgo;
import TraitFactory.contruirBoca;
import TraitFactory.contruirContorno;
import TraitFactory.contruirNariz;
import TraitFactory.contruirOjo;
import funcionalidades.*;
import traits.*;
public abstract class personaje {
	
	protected rasgo ojos;
	protected rasgo nariz;
	protected rasgo boca;
	protected rasgo contorno;
	protected rasgo cabello;
	protected rasgo cabeza;
	public caminar_tipo caminar;
	public golpear_tipo golpear;
	public hablar_tipo hablar;
	
	public personaje () {
		
		
		
	}
	
	public void cambiarOjos(String tipo) {
		TipoRasgo rasgo= new contruirOjo();
		ojos=rasgo.construirRasgo(tipo);
	}
	
	public void cambiarBoca(String tipo) {
		TipoRasgo rasgo= new contruirBoca();
		boca=rasgo.construirRasgo(tipo);
	}
	
	public void cambiaNariz(String tipo) {
		TipoRasgo rasgo= new contruirNariz();
		ojos=rasgo.construirRasgo(tipo);
	}
	public void cambiaContorno(String tipo) {
		TipoRasgo rasgo= new contruirContorno();
		contorno=rasgo.construirRasgo(tipo);
	}

	public rasgo getOjos() {
		return ojos;
	}

	public rasgo getNariz() {
		return nariz;
	}

	public rasgo getBoca() {
		return boca;
	}

	public rasgo getContorno() {
		return contorno;
	}

	public rasgo getCabello() {
		return cabello;
	}

	public rasgo getCabeza() {
		return cabeza;
	}

	public caminar_tipo caminar() {
		return caminar;
	}

	public hablar_tipo hablar() {
		return hablar;
	}
	public golpear_tipo golpear() {
		return golpear;
	}
	
	
	public void set_hablar(hablar_tipo hablar) {
		this.hablar= hablar;
	}
	public void set_caminar(caminar_tipo caminar) {
		this.caminar= caminar;
	}
	public void set_golpear(golpear_tipo golpear) {
		this.golpear= golpear;
	}
	

}
