package ejercicio7;

import java.util.List;

public class Venta {
	//Fields
	private List <LineaDeVenta> lista;
	//Constructor

	public Venta(List<LineaDeVenta> lista) {
		super();
		this.lista = lista;
	}

	
	
	//Methods
	public double calcularPrecioFinal() {
		double precio=0;
		for(LineaDeVenta p : lista) {
			precio += p.calcularPrecioTotal();
		}
		return precio;
	}
}
