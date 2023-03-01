package ejercicio4;

import java.util.Comparator;

public class CompararPorID implements Comparator<Contacto>{

	@Override
	public int compare(Contacto o1, Contacto o2) {
		if(o1.getId() > o2.getId()) {
			return 1;
		}else {
			if(o2.getId()> o1.getId()) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}

	

}
