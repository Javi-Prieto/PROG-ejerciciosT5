package ejercicio7;


import java.util.Iterator;
import java.util.Map;

public class Venta {
	//Fields
	private Map <Integer,LineaDeVenta> lista;
	//Constructor

	public Venta(Map<Integer,LineaDeVenta> lista) {
		super();
		this.lista = lista;
	}

	
	
	//Methods
	public double calcularPrecioFinal() {
		double precio=0;
		for(LineaDeVenta p : lista.values()) {
			precio += p.calcularPrecioTotal();
		}
		return precio;
	}
	public void agregarLineaVenta(int i ,LineaDeVenta li) {
		lista.put(i, li);
	}

	public void mostrarTicket() {
		Iterator<LineaDeVenta> it = lista.values().iterator();
		System.out.println("---------------------------------------------------------");
		System.out.println("Cantidad \t Producto \t Precio Unit \t Precio Final");
		while(it.hasNext()) {
			System.out.println(it.next().getCant() +"\t\t" + it.next().getPr().getNombre() + "\t" 
		/*+ it.next().getPr().getPrecioUnit() + "\t"+ it.next().calcularPrecioTotal()*/);
		}
	}

	@Override
	public String toString() {
		return "Venta [lista=" + lista + "]";
	}
}
