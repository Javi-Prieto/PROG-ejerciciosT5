package ejercicio4;

import java.util.Iterator;
import java.util.Map;

public class Agenda {
	//Fields
	private Map <Contacto, Integer>lista;
	//Constructor

	public Agenda(Map<Contacto, Integer> lista) {
		super();
		this.lista = lista;
	}
	//getter and setter

	public Map<Contacto, Integer> getLista() {
		return lista;
	}

	public void setLista(Map<Contacto, Integer> lista) {
		this.lista = lista;
	}
	//toString

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}
	
	public void agregarCont(Contacto c, Integer num) {
		lista.put(c, num);
	}
	
	public void mostrarTodos() {
		for(Contacto c : lista.keySet()) {
			System.out.println(c);
		}
	}
	
	public Contacto buscarID(int id) {
		Iterator<Contacto> it = lista.keySet().iterator();
		Contacto co;
		while(it.hasNext()) {
			co = it.next();
			if(co.getId() == id) {
				return co;
			}
		}
		return null;
	}
	
	public void borrarContacto(int id) {
		lista.remove(buscarID(id));
	}
}
