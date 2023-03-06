package ejercicio8;

public class Cliente implements Comparable<Cliente>{
	//Fields
	private String nombre, dni;
	private int edad;
	
	//Constructor
	public Cliente(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	//Getter and Setter

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	//ToString

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Cliente o) {
		if(this.getEdad() > o.getEdad()) {
			return 1;
		}else {
			if(this.getEdad() < o.getEdad()) {
				return -1;
			}else {
				return 0;
			}
		}
	}
	
}
