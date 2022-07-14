package TraitFactory;

import traits.bocaAlargada;
import traits.bocaPequena;
import traits.bocagruesa;
import traits.*;
public class contruirNariz  extends TipoRasgo{

	String ubicacion="                 ";
	@Override
	public rasgo construirRasgo(String rasgo) {
		rasgo r=null;
		if (rasgo.equals("larga")) {
			r=new narizLarga();
		}
		if (rasgo.equals("punta")) {
			r=new narizPunta();
		}
		if (rasgo.equals("circular")) {
			r=new narizCircular();
		}
		
		return r;
		
	}
	
}
