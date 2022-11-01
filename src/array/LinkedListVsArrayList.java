package array;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {

	public static void main(String[] args) {
		
		// Criando 
		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("Oi");
		namesLinkedList.add("Eai");
		namesLinkedList.add("Coé");
		namesLinkedList.add("Moanoiti");
		
		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("Oi");
		namesArrayList.add("Eai");
		namesArrayList.add("Coé");
		namesArrayList.add("Moanoiti");
		
		
		// Imprimir uma posição
		System.out.println(namesLinkedList.get(2));
		System.out.println(namesArrayList.get(2));
		
		
		// Adicionar 
		namesLinkedList.add(1, "Tchau");
		namesArrayList.add(1, "Tchau");
		
		/* 
		 * Eles tem grandes diferenças de performance, se for para
		 * excluir algum índice ou adicionar, o LinkedList será mais otimizado,
		 * Já para pegar uma posição aleatória, o ArrayList será melhor
		 * Depende do uso que você quiser, mas no dia a dia será quase
		 * a mesma coisa
		 * */
	}

}
