package ejercicio1;

public class Nota {
	//Fields
	private String propietario, contenido;
	private int nNota;
	//Constructor
	public Nota(String propietario, String contenido, int nNota) {
		super();
		this.propietario = propietario;
		this.contenido = contenido;
		this.nNota = nNota;
	}
	//Getter and setter
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public int getnNota() {
		return nNota;
	}
	public void setnNota(int nNota) {
		this.nNota = nNota;
	}
	//toString
	@Override
	public String toString() {
		return "Nota [propietario=" + propietario + ", contenido=" + contenido + ", nNota=" + nNota + "]";
	}
	
}
