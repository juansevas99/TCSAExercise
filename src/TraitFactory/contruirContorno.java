package TraitFactory;

import traits.contornoCurvo;
import traits.contornoPunta;
import traits.contornoRecto;
import traits.rasgo;

public class contruirContorno extends TipoRasgo {

	@Override
	public rasgo construirRasgo(String rasgo) {
		rasgo r=null;
		if (rasgo.equals("curvo")) {
			r=new contornoCurvo();
		}
		if (rasgo.equals("punta")) {
			r=new contornoPunta();
		}
		if (rasgo.equals("recto")) {
			r=new contornoRecto();
		}
		
		return r;
		
	}
}
