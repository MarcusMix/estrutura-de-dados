package prova1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class prova1 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int fila[] = new int[20];
		Queue<Integer> filaQueue = new LinkedList<>();
		Stack<Integer> pilhaStack = new Stack<>();
		Stack<Integer> pilhaInvertida = new Stack<Integer>();
		
		int maior = 0;
		int menor = 99;
		int soma = 0;
		
		for(int x = 0; x < fila.length; x++) {
			int numeros = random.nextInt(26);
			if(numeros < menor) {
				menor = numeros;				
			} 
			if (numeros > maior) {
				maior = numeros;
			}
			filaQueue.add(numeros);
			pilhaStack.add(numeros);
			soma += numeros;
		}
		
		for (int i = 0; i < fila.length; i++) {
			pilhaInvertida.add(pilhaStack.pop());
		}
		
		double media = soma / fila.length;
		System.out.println("Fila pronta, aperte ENTER para continuar");
		
		while(true) {
			String input  = teclado.nextLine();
			if (!input.equals("")) {
			} else {
				System.out.println("Impress�o da fila: " + filaQueue);	
				System.out.println("Impress�o da pilha: " + pilhaInvertida);
				System.out.println("Maior n�mero criado pelo Random: " + maior);
				System.out.println("Menor n�mero criado pelo Random: " + menor);
				System.out.println("A m�dia dos n�meros criados �: " + media);
				break;
			}
		}
			
	}

}
