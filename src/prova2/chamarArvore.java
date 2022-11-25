package prova2;

import java.util.Random;
import java.util.Scanner;

public class chamarArvore {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner kb = new Scanner(System.in);
		Tree<Integer> treeMultipliedBy5 = new Tree<Integer>();
		Tree<Integer> tree = new Tree<Integer>();
		
		int higherNumber = 0;
		int lowerNumber = 9999;
		int[] listOfNumbers = new int[10];
		
		for(int j = 0; j < listOfNumbers.length; j++) {
			int numbers = random.nextInt(1000);
			if(numbers < lowerNumber) {
				lowerNumber = numbers;				
			} 
			if(numbers > higherNumber) {
				higherNumber = numbers;
			}
			tree.adicionar(numbers);
			treeMultipliedBy5.adicionar(numbers * 5);
		}	

		
		
		System.out.println("Tudo certo, aperte QUALQUER TECLA para proseguir!");
		
		while(true) {
			String input  = kb.nextLine();
			if (!input.equals("")) {
			} else {
				
				System.out.println("\nValores da árvore ordenados: \n");
				tree.ordenarArvore(tree.getRaiz());
//				System.out.println("\n-------------------------------");
				System.out.println("\nValores da árvore multiplicados por 5\n");
				tree.ordenarArvore(treeMultipliedBy5.getRaiz());
//				System.out.println("-------------------------------");
				System.out.println("\nMaior número da árvore: " + higherNumber);
				System.out.println("\nMenor número da árvore: " + lowerNumber);
				break;
			}
		}		
	}
}
