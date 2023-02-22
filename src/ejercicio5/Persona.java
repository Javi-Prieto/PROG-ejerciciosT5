package ejercicio5;

public class Persona implements Comparable <Persona>{
	//Fields
	private String nombre, dni, apellidos;
	private double salario;
	private int edad;
	
	//Constructor
	
	
	public Persona(String nombre, String dni, String apellidos, double salario, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.apellidos = apellidos;
		this.salario = salario;
		this.edad = edad;
	}

	

	//Getter and setter
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public int compareTo(Persona o) {
		String ape1 = this.apellidos, ape2 = o.apellidos;
		return ape1.toLowerCase().compareTo(ape2.toLowerCase());
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", edad=" + edad + "]";
	}
	
	
}
