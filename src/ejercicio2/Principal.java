package ejercicio2;

import java.util.ArrayList;

import utilidades.Leer;

public class Principal {
	public static void main(String[] arg) {
		ArrayList <Socio> lista = new ArrayList <Socio>();
		Socio soc;
		CRUDSocio crud;
		GestionClub gest;
		double cuota, nCaballos;
		System.out.println("Bienvenido indique la cuota por caballo");
		cuota = Leer.datoDouble();
		crud = new CRUDSocio(lista);
		
	}
}
 	