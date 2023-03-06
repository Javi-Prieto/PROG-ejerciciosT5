package ejercicio8;

public class CuentaJoven extends Cuenta{
	//Fields
	private int regalo = 1;
	
	//Constructor
	public CuentaJoven(double saldo, boolean mantenimiento) {
		super(saldo, mantenimiento);
		// TODO Auto-generated constructor stub
	}
	
	//Getter and setter
	public int getRegalo() {
		return regalo;
	}

	public void setRegalo(int regalo) {
		this.regalo = regalo;
	}

	
	
	//toString
	@Override
	public String toString() {
		return "CuentaJoven [regalo=" + regalo + ", toString()=" + super.toString() + "]";
	}
	//Methods

	@Override
	public void ingresarDinero(double din) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo()+ din + regalo);
		
	}

	@Override
	public void retirarDinero(double din) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo() - din);
	}

	
	
	
	
}
