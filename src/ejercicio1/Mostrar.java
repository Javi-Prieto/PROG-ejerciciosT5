package ejercicio1;

public class Mostrar {
	//Methods
	public void imprimirMenu() {
		System.out.println("-----------------MENU-----------------");
		System.out.println("1. Mostrar una Nota");
		System.out.println("2. Mostrar cantidad de notas");
		System.out.println("3. Agregar Nota");
		System.out.println("4. Borrar Nota");
		System.out.println("0. Salir");
		System.out.println("--------------------------------------");
	}
	public void mostrarNota(Nota no) {
		System.out.println("Nota propiedad de: " + no.getPropietario());
		System.out.println("Número de nota: " + no.getnNota());
		System.out.println("Contenido: ");
		System.out.println(no.getContenido());
	}
	
}
