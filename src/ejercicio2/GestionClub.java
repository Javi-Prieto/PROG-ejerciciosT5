package ejercicio2;

public class GestionClub {
	//Fields
	private CRUDSocio soc;
	private double cuotaBarco;
	//Constructor
	public GestionClub(CRUDSocio soc, double cuotaBarco) {
		super();
		this.soc = soc;
		this.cuotaBarco = cuotaBarco;
	}
	//Getter and setter
	public CRUDSocio getSoc() {
		return soc;
	}
	public void setSoc(CRUDSocio soc) {
		this.soc = soc;
	}
	public double getCuotaBarco() {
		return cuotaBarco;
	}
	public void setCuotaBarco(double cuotaBarco) {
		this.cuotaBarco = cuotaBarco;
	}
	//toString
	@Override
	public String toString() {
		return "GestionClub [soc=" + soc + ", cuotaBarco=" + cuotaBarco + "]";
	}
	//Methods
	public void addSocio(Socio so) {
		soc.addSocio(so);
	}
	public void deleteSocio(int index) {
		soc.deleteSocio(index);
	}
	public void modNCaballo(int index, int nCaba) {
		soc.modNCaballo(index, nCaba);
	}
	public double cuotaFinal(int index) {
		return soc.getLista().get(index).getnCaballo() * cuotaBarco;
	}
}
