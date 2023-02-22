package ejercicio6;

public class Trabajador {
	//Fields
	private String nombre, dni;
	private double horasT, sueldoF;
	//Constructor
	public Trabajador(String nombre, String dni, double horasT, double sueldoF) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horasT = horasT;
		this.sueldoF = sueldoF;
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
	public double getHorasT() {
		return horasT;
	}
	public void setHorasT(double horasT) {
		this.horasT = horasT;
	}
	public double getSueldoF() {
		return sueldoF;
	}
	public void setSueldoF(double sueldoF) {
		this.sueldoF = sueldoF;
	}
	//toString
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasT=" + horasT + ", sueldoF=" + sueldoF + "]";
	}
	
	
	
}
