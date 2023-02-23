package ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Contacto, Integer> lista = new HashMap <Contacto,Integer>();
		Contacto c1 = new Contacto(1, "fjels@fe", "Juan"), 
				c2 = new Contacto(2, "fesfes@fes", "Pepe");
		Agenda ag = new Agenda (lista);
		Integer num1=65156, num2 = 56461; 
		ag.agregarCont(c2, num1);
		ag.agregarCont(c2, num2);
		
		ag.mostrarTodos();
		
	}

}
