package ejercicio5;

import java.util.Comparator;

public class CompararPorSalario implements Comparator <Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		double sal1 = o1.getSalario() ,sal2 = o2.getSalario();
		if(sal1 > sal2) {
			return -1;
		}else {
			if(sal2 > sal1) {
				return 1;
			}
			return 0;
		}
	}

}
