package ejercicio8;

public class CuentaEmpresa extends Cuenta {
	//Fields
	private double robo = 1;
	//COnstructor
	public CuentaEmpresa(double saldo, boolean mantenimiento) {
		super(saldo, mantenimiento);
		// TODO Auto-generated constructor stub
	}
	
	//Getter and Setter

	public double getRobo() {
		return robo;
	}



	public void setRobo(double robo) {
		this.robo = robo;
	}

	//ToString
	
	@Override
	public String toString() {
		return "CuentaEmpresa [robo=" + robo + ", toString()=" + super.toString() + "]";
	}
	//Methods
	
	@Override
	public void ingresarDinero(double din) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo()+din);
	}

	

	@Override
	public void retirarDinero(double din) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo() - din - robo);
	}

}
