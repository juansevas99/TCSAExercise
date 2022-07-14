package TraitFactory;
import traits.*;
import java.util.ArrayList;

public class contruirOjo extends TipoRasgo {
	ArrayList<String> ojos= new ArrayList<String>();
	String ubicacion="                 ";
	@Override
	public rasgo construirRasgo(String rasgo) {
		rasgo r=null;
		if (rasgo.equals("japones")) {
			ojos.add("japones");
			r=new ojoJapones();
		}
		if (rasgo.equals("normales")) {
			ojos.add("normales");
			r=new ojoNormal();
		}
		if (rasgo.equals("chino")) {
			ojos.add("chino");
			r=new ojoChino();
		}
		
		return r;
		
	}

}
