package fila;

import java.util.LinkedList;
import java.util.Queue;

public class exemplo01_fila {

	
	public static void main(String[] args) {
		
		Queue<String> carros = new LinkedList<>();
		
		carros.add("hrv");
		carros.add("ferrari");
		carros.add("polo");
		carros.add("camaro");
		
		System.out.println("Topo da fila: " + carros.poll()); // pega o primeiro e remove da lista
		System.out.println(carros);
		System.out.println(carros.isEmpty()? "Fila vazia" : "Fila com elementos");
	}
}
