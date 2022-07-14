package TraitFactory;

import java.util.ArrayList;
import traits.*;
public class contruirBoca extends TipoRasgo {
	ArrayList<String> bocas= new ArrayList<String>();

	String ubicacion="                 ";
	@Override
	public rasgo construirRasgo(String rasgo) {
		rasgo r=null;
		if (rasgo.equals("gruesa")) {
			bocas.add("gruesa");
			r=new bocagruesa();
		}
		if (rasgo.equals("alargada")) {
			bocas.add("alargada");
			r=new bocaAlargada();
		}
		if (rasgo.equals("pequena")) {
			bocas.add("pequena");
			r=new bocaPequena();
		}
		
		return r;
		
	}
		
}
