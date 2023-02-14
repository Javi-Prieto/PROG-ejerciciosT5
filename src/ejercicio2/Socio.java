package ejercicio2;

public class Socio {
	//Fields
	private String nombre, dni;
	private int nCaballos;
	//Constructor
	public Socio(String nombre, String dni, int cuota) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.nCaballos = cuota;
	}
	//Getter and setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getnCaballo() {
		return nCaballos;
	}
	public void setnCaballo(int cuota) {
		this.nCaballos = cuota;
	}
	//toString
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", dni=" + dni + ", número de caballos=" + nCaballos + "]";
	}
	
}
