package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {
	public static void main(String[] arg) {
		List <Socio> lista = new ArrayList <Socio>();
		Socio soc;
		CRUDSocio crud;
		GestionClub gest;
		double cuota;
		int op, opL, nCaballos;
		String dni, nombre;
		System.out.println("Bienvenido indique la cuota por caballo");
		cuota = Leer.datoDouble();
		crud = new CRUDSocio(lista);
		gest = new GestionClub(crud, cuota);
		do {
			System.out.println("---------------MENU---------------");
			System.out.println("1. Añadir cliente");
			System.out.println("2. Buscar cliente");
			System.out.println("3. Modificar cliente");
			System.out.println("4. Borrar Cliente");
			System.out.println("0. Salir");
			System.out.println("----------------------------------");
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch (op) {
				case 1:
					System.out.println("Diga el nombre");
					nombre = Leer.dato();
					System.out.println("Diga el dni del socio");
					dni = Leer.dato();
					System.out.println("Diga el número de caballos");
					nCaballos = Leer.datoInt();
					soc = new Socio(nombre, dni, nCaballos);
					gest.addSocio(soc);
					break;
				case 2:
					System.out.println("Diga el dni del socio");
					dni = Leer.dato();
					gest.mostrarCliente(dni);
					break;
				case 3:
					System.out.println("Diga el dni del socio a modificar");
					dni = Leer.dato();
					System.out.println("Diga el nuevo número de caballos");
					nCaballos = Leer.datoInt();
					gest.modNCaballo(dni, nCaballos);
					System.out.println(gest.getSoc().getLista());
					break;
				case 4:
					System.out.println("Diga el dni del socio a borrar");
					dni = Leer.dato();
					gest.deleteSocio(dni);
					break;
				case 0:
					System.out.println("Gracias por usar el programa");
					break;
				default:
					System.out.println("Error: Número incorrecto");
			}
		}while(op != 0);
		
	}
}
 	