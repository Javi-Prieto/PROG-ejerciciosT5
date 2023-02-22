package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Persona> lista = new ArrayList <Persona>();
		lista.add(new Persona("Juan", "3025", "Pfeerez", 30.5, 10));
		lista.add(new Persona("Manolito", "3121025", "Gutierrez", 30.6, 100));
		lista.add(new Persona("Jonapero", "301525", "Joan", 300.5, 1));
		lista.add(new Persona("Filiberto", "43025", "Ruep", 3.5, 22));
		System.out.println("Ordenado por Apellido");
		Collections.sort(lista);
		for(Persona p : lista) {
			System.out.println(p);
		}
		
		System.out.println();
		Collections.sort(lista, new CompararPorSalario());
		System.out.println("Ordenado por salario mayor a menor");
		for(Persona p : lista) {
			System.out.println(p);
		}
		
		System.out.println();
		Collections.sort(lista, new CompararPorEdad());
		System.out.println("Ordenado por salario menor a mayor");
		for(Persona p : lista) {
			System.out.println(p);
		}
	}

}
