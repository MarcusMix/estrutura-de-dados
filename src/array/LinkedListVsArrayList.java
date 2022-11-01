package array;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {

	public static void main(String[] args) {
		
		// Criando 
		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("Oi");
		namesLinkedList.add("Eai");
		namesLinkedList.add("Co�");
		namesLinkedList.add("Moanoiti");
		
		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("Oi");
		namesArrayList.add("Eai");
		namesArrayList.add("Co�");
		namesArrayList.add("Moanoiti");
		
		
		// Imprimir uma posi��o
		System.out.println(namesLinkedList.get(2));
		System.out.println(namesArrayList.get(2));
		
		
		// Adicionar 
		namesLinkedList.add(1, "Tchau");
		namesArrayList.add(1, "Tchau");
		
		/* 
		 * Eles tem grandes diferen�as de performance, se for para
		 * excluir algum �ndice ou adicionar, o LinkedList ser� mais otimizado,
		 * J� para pegar uma posi��o aleat�ria, o ArrayList ser� melhor
		 * Depende do uso que voc� quiser, mas no dia a dia ser� quase
		 * a mesma coisa
		 * */
	}

}
