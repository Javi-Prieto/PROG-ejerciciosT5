package ejercicio3;


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
	
}
