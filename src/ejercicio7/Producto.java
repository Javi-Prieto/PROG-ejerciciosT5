package ejercicio7;


public abstract class Producto implements Comparable<Producto>{
	//Fields
	private double precioUnit;
	private String nombre, id;
	//COnstructor
	public Producto(double precioUnit, String nombre, String id) {
		super();
		this.precioUnit = precioUnit;
		this.nombre = nombre;
		this.id = id;
	}
	//Getter and setter
	public double getPrecioUnit() {
		return precioUnit;
	}
	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//toString
	@Override
	public String toString() {
		return "Producto [precioUnit=" + precioUnit + ", nombre=" + nombre + ", id=" + id + "]";
	}
	//Method
	public abstract double calcularPVP();
	
	@Override
	public int compareTo(Producto o) {
		return -(this.nombre.toLowerCase().compareTo(o.nombre.toLowerCase()));
	}
}
