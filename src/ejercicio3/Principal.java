package ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Alumno> lista = new HashSet <Alumno>();
		CRUDAlumno crudal;
		crudal = new CRUDAlumno(lista);
		Clase cl = new Clase(crudal);
		
		cl.agregarAlumno(new Alumno("Juan", "84392", 2.5));
		cl.agregarAlumno(new Alumno("Pepe", "28", 3.1));
		
		cl.mostrar();
		System.out.println("La nota media de la clase es: "+cl.calcularNotaMedia());
		System.out.println("La cantidad de suspensos es: " + cl.contarSuspensos());
		
	}

}
