package ejercicio1;

import java.util.ArrayList;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Nota no;
		int op, opN, nNota = 0;
		Mostrar mo = new Mostrar(); 
		String propiedad, contenido;
		
		ArrayList <Nota> listaNotas = new ArrayList<Nota>();
		do {
			mo.imprimirMenu();
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch (op) {
				case 1:
					System.out.println(listaNotas);
					System.out.println("¿Cuál desea mostrar?");
					opN = Leer.datoInt();
					mo.mostrarNota(listaNotas.get(opN-1));
					break;
				case 2:
					System.out.println("El número de notas guardadadas es: " + listaNotas.size());
					break;
				case 3:
					System.out.println("Indique el propietario");
					propiedad = Leer.dato();
					System.out.println("Indique el contenido");
					contenido = Leer.dato();
					no = new Nota(propiedad, contenido, nNota);
					
					listaNotas.add(no);
					nNota ++;
					break;
				case 4:
					if(!listaNotas.isEmpty()) {
						System.out.println(listaNotas);
						System.out.println("¿Cuál desea borrar?");
						opN = Leer.datoInt();
						listaNotas.remove(opN-1);
						System.out.println("Nota borrada correctamente");
					}else {
						System.out.println("La lista esta vacía");
					}
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
