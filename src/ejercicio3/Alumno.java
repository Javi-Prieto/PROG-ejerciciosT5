package ejercicio3;


public class Alumno {
	//Fields
	private String nombre, codAlu;
	private double  notasM;
	//Constructor
	public Alumno(String nombre, String codAlu, double notas) {
		super();
		this.nombre = nombre;
		this.codAlu = codAlu;
		this.notasM = notas;
	}
	//Getter and setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodAlu() {
		return codAlu;
	}
	public void setCodAlu(String codAlu) {
		this.codAlu = codAlu;
	}
	public double getNotas() {
		return notasM;
	}
	public void setNotas(double notas) {
		this.notasM = notas;
	}
	//toString
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", codAlu=" + codAlu + ", notasM=" + notasM + "]";
	}
	
	
}
