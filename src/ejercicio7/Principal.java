package ejercicio7;

import java.util.HashMap;
import java.util.Map;

public class Principal {
	public static void main(String [] args) {
		Map <Integer, LineaDeVenta> lista = new HashMap<Integer, LineaDeVenta>();
		Venta ven = new Venta (lista);
		Producto rop = new Ropa(20, "Camiseta", "0"), 
				alim = new Alimentacion(10, "Manzana", "1", 28);
		LineaDeVenta lin = new LineaDeVenta(rop, 2),
				lin2 = new LineaDeVenta(alim, 1);
		ven.agregarLineaVenta(0, lin);
		ven.agregarLineaVenta(1, lin2);
		ven.mostrarTicket();
	}
}
