package ejercicio5;

import java.util.Comparator;

public class CompararPorEdad implements Comparator <Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		if(o1.getEdad() > o2.getEdad()) {
			return 1;
		}else {
			if(o2.getEdad() > o1.getEdad()) {
				return -1;
			}
			return 0;
		}
	}

}
