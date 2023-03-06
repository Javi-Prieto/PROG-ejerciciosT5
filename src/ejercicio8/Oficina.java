package ejercicio8;

import java.util.Map;
import java.util.TreeMap;

public class Oficina {
	//Fields
	private Map<Cliente, Cuenta> lista;
	//COnstructor

	public Oficina(Map<Cliente, Cuenta> lista) {
		super();
		this.lista = lista;
	}
	//Getter and Setter

	public Map<Cliente, Cuenta> getLista() {
		return lista;
	}

	public void setLista(Map<Cliente, Cuenta> lista) {
		this.lista = lista;
	}
	//ToString

	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}
	//Methods
	public boolean  addCuenta(Cuenta cu, Cliente cl) {
		if(lista.put(cl, cu) == null) {
			return false;
		}else {
			lista.put(cl, cu);
			return true;
		}
	}
	 
	public Cliente findByDNI(String dni) {
		for(Cliente cl : lista.keySet()) {
			if(cl.getDni().equalsIgnoreCase(dni)) {
				return cl;
			}
		}
		return null;
	}
	
	public void addMoney(double din, String dni) {
		if(findByDNI(dni) != null) {
			lista.get(findByDNI(dni)).ingresarDinero(din);
		}else {
			System.out.println("Persona no encontrada");
		}
		
	}
	public void substractMoney(double din, String dni) {
		if(findByDNI(dni) != null) {
			lista.get(findByDNI(dni)).retirarDinero(din);
		}else {
			System.out.println("Persona no encontrada");
		}
		
	}
	
	public void mostrarUno(String dni) {
		if(findByDNI(dni) != null) {
			System.out.println("Cliente: " + findByDNI(dni));
			System.out.println("Cuenta: " + lista.get(findByDNI(dni)));
		}else {
			System.out.println("Persona no encontrada");
		}
	}
	public void mostrarTodos(int num) {
		Map <Cliente, Cuenta> listado;
		
		switch(num) {
			case 1:
				listado  = new TreeMap<Cliente, Cuenta>();
				listado.putAll(lista);
				for(Cliente cl : listado.keySet()) {
					System.out.println("Cliente: " + cl);
					System.out.println("Cuenta: " + listado.get(cl));
				}
				break;
			case 2:
				listado  = new TreeMap<Cliente, Cuenta>(new CompararPorNombre());
				listado.putAll(lista);
				System.out.println("----------------MOSTRAR---------------");
				for(Cliente cl : listado.keySet()) {
					
					System.out.println("Cliente: " + cl);
					System.out.println("Cuenta: " + listado.get(cl));
					System.out.println("-----------------------------------");
				}
				break;
			case 0:
				System.out.println("Volviendo al menú");
				break;
			default:
				System.out.println("Número inexistente");
				
		}
	}
}
