package ejercicio3;

import java.util.Iterator;

public class Clase {
	//Fields
	private CRUDAlumno lista;
	//Constructor

	public Clase(CRUDAlumno lista) {
		super();
		this.lista = lista;
	}
	//Getter and setter

	public CRUDAlumno getLista() {
		return lista;
	}

	public void setLista(CRUDAlumno lista) {
		this.lista = lista;
	}
	//toString

	@Override
	public String toString() {
		return "Clase [lista=" + lista + "]";
	}
	//Methods
	public void agregarAlumno(Alumno al) {
		lista.addAlum(al);
	}
	public void mostrar() {
		for(Alumno al : lista.getLista()) {
			System.out.println(al);
		}
	}
	public double calcularNotaMedia(){
		Iterator<Alumno> it = lista.getLista().iterator();
		double notaM = 0; 	
		while (it.hasNext()) {
			notaM += it.next().getNotas();
		}
		return notaM/lista.getLista().size();
	}
	public int contarSuspensos() {
		int num = 0;
		for(Alumno al : lista.getLista()) {
			if(al.getNotas() < 5) {
				num ++;
			}
		}
		return num;
	}
}
