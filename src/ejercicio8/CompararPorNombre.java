package ejercicio8;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		
		return (o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase()));
	}

}
