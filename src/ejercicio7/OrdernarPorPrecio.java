package ejercicio7;

import java.util.Comparator;

public class OrdernarPorPrecio implements Comparator<Producto>{

	@Override
	public int compare(Producto o1, Producto o2) {
		if(o1.getPrecioUnit() > o2.getPrecioUnit()) {
			return 1;
		}else {
			if(o2.getPrecioUnit() > o1.getPrecioUnit()) {
				return -1;
			}else {
				return 0;
			}
		}
	}
	
}
