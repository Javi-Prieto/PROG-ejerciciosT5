package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class CRUDSocio {
	//Fields
	private List <Socio> lista;
	//Constructor

	public CRUDSocio(List<Socio> lista) {
		super();
		this.lista = lista;
	}
	//Getter and setter

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Socio> lista) {
		this.lista = lista;
	}
	//toString

	@Override
	public String toString() {
		return "CRUDSocio [lista=" + lista + "]";
	}
	//Methods
	public void addSocio(Socio so) {
		lista.add(so);
	}
	public void deleteSocio(int index) {
		lista.remove(index);
	}
	public void modNCaballo(int index, int newCaba) {
		lista.get(index).setnCaballo(newCaba);
	}
	public int findByDni (String dni) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < lista.size()) {
			if(lista.get(i).getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			}else {
				i ++;
			}
		}
		if (encontrado) {
			return i;
		}else {
			return -1;
		}
	}
}
