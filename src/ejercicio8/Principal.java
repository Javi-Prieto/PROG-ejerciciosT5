package ejercicio8;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		String nombre, dni;
		double saldo;
		int opU, opN, edad;
		Oficina of;
		Cliente cl;
		Cuenta cu;
		Map <Cliente, Cuenta> lista = new HashMap<Cliente, Cuenta>();
		of= new Oficina(lista);
		do {
			System.out.println("-------------------------------");
			System.out.println("1. Agregar Cliente y Cuenta");
			System.out.println("2. Ingresar dinero");
			System.out.println("3. Retirar dinero");
			System.out.println("4. Mostrar todos");
			System.out.println("0. Salir");
			System.out.println("------------------------------");
			System.out.println("¿Qué desea hacer?");
			opU = Leer.datoInt();
			switch(opU) {
				case 1:
					System.out.println("Diga el nombre: ");
					nombre = Leer.dato();
					System.out.println("Diga el dni: ");
					dni = Leer.dato();
					System.out.println("Diga la edad: ");
					edad = Leer.datoInt();
					cl = new Cliente(nombre, dni, edad);
					System.out.println("Indique el saldo inicial de la cuenta");
					saldo = Leer.datoDouble();
					if(edad > 20) {
						System.out.println("Le corresponde una Cuenta Joven");
						cu = new CuentaJoven(saldo, false);
						of.addCuenta(cu, cl);
					}else {
						System.out.println("----------------------");
						System.out.println("1. Cuenta Corriente");
						System.out.println("2. Cuenta Empresa");
						System.out.println("0. Salir");
						System.out.println("----------------------");
						System.out.println("¿Cuál desea?");
						opN = Leer.datoInt();
						switch(opN) {
						case 1:
							cu = new CuentaCorriente(saldo, true);
							of.addCuenta(cu, cl);
							break;
						case 2:
							cu = new CuentaEmpresa(saldo, false);
							of.addCuenta(cu, cl);
							break;
						case 0:
							System.out.println("Volviendo al menú");
							break;
						default:
							System.out.println("Numero inexistente");
						}
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					System.out.println("Hasta luego gracias");
					break;
				default:
					System.out.println("Número inexistente");
			}
		}while(opU != 0);

	}

}
