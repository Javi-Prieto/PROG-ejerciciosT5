package ejercicio8;

public class CuentaCorriente extends Cuenta {
	
	//Private
	private int puntos =0;
	
	//Constructor
	public CuentaCorriente(double saldo, boolean mantenimiento) {
		super(saldo, mantenimiento);
		// TODO Auto-generated constructor stub
	}
	//Getter and setter

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	//ToString
	@Override
	public String toString() {
		return "CuentaCorriente [puntos=" + puntos + ", toString()=" + super.toString() + "]";
	}

	
	//Methods
	@Override
	public void ingresarDinero(double din) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo() + din);
		puntos ++;
	}

	@Override
	public void retirarDinero(double din) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo() - din);
		puntos ++;
	}
	
	
	
	
	
}
