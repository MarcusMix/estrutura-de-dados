package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		
		// criar array normal
		String[] friendsArray = {"Joan", "Cris", "Erik", "Joana"};
		String[] friendsArray2 = new String[4];
		
		
		// Com array list
		// Tem tamanho dinâmico, ou seja, não declara o tamanho, 
		// Ele vai se ajustando conforme
		// For inserindo dados dentro
		
		// Criar array list
		ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Joan", "Cris", "Erik", "Joana"));
		ArrayList<String> friendsArrayList2 = new ArrayList<>();		
		
		
		// Impressão de uma posição
		System.out.println(friendsArray[1]);
		System.out.println(friendsArrayList.get(1));
		
		
		// Tamanho
		System.out.println(friendsArray.length);
		System.out.println(friendsArrayList.size());
		
		
		// Adicionar elementos
		// Você não consegue fazer isso com array :(
		friendsArrayList.add("Milena");
		System.out.println(friendsArrayList.get(4));
		
		
		//colocar elementos
		friendsArray[0] = "Marcus";
		System.out.println(friendsArray[0]);
		friendsArrayList.set(0, "Marcus");
		System.out.println(friendsArrayList.get(0));
		
		
		// Remover elementos
		// Não da pra fazer com array :(
		friendsArrayList.remove(1);
		// Podemos escolher pelo index ou pelo propria String
		System.out.println(friendsArrayList.get(1));
		
		
		//Impressão print
		System.out.println(friendsArray);
		System.out.println(friendsArrayList);
	}

}
