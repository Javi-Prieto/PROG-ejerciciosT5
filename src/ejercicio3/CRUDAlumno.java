package ejercicio3;

import java.util.Iterator;
import java.util.Set;

public class CRUDAlumno {
	//Fields
	private Set <Alumno> lista;
	//Constructor
	public CRUDAlumno(Set<Alumno> lista) {
		super();
		this.lista = lista;
	}
	//Getter and setter
	public Set<Alumno> getLista() {
		return lista;
	}
	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}
	//toString
	@Override
	public String toString() {
		return "Alumno [lista=" + lista + "]";
	}
	//Methods
	public void addAlum(Alumno al) {
		lista.add(al);
	}
	public void deleteAlum(Alumno al) {
		lista.remove(al);
	}
	public void changeMarks(String code) {
		Iterator <Alumno> it = lista.iterator();
		boolean encontrado = false;
		Alumno al;
		while (it.hasNext() && !encontrado) {
			al = it.next();
			if(al.getCodAlu().equalsIgnoreCase(code)) {
				encontrado = true;
			}
		}
		
	}
}
