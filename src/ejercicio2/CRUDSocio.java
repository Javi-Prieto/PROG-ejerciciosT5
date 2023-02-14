package ejercicio2;

import java.util.ArrayList;

public class CRUDSocio {
	//Fields
	ArrayList <Socio> lista = new ArrayList<Socio>();
	//Constructor

	public CRUDSocio(ArrayList<Socio> lista) {
		super();
		this.lista = lista;
	}
	//Getter and setter

	public ArrayList<Socio> getLista() {
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
}
