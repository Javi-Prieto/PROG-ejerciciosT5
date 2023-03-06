package ejercicio8;

import java.util.Iterator;
import java.util.Map;

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
	public void addMoney(double din) {
		
	}
}
