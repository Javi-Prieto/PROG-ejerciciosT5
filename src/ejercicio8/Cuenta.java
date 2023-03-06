package ejercicio8;

public abstract class Cuenta implements Comparable<Cuenta> {
	//Fields
	private double saldo;
	private boolean mantenimiento;
	//Constructor
	public Cuenta(double saldo, boolean mantenimiento) {
		super();
		this.saldo = saldo;
		this.mantenimiento = mantenimiento;
	}
	//Getter and setter
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isMantenimiento() {
		return mantenimiento;
	}
	public void setMantenimiento(boolean mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	//ToString
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", mantenimiento=" + mantenimiento + "]";
	}
	//Methods
	public abstract void ingresarDinero(double din);
	public abstract void retirarDinero(double din);
	@Override
	public int compareTo(Cuenta o) {
		if(this.saldo > o.saldo) {
			return 1;
		}else {
			if(this.saldo < o.saldo) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}
