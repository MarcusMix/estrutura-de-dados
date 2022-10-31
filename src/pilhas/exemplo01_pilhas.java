package pilhas;

import java.util.Stack;

public class exemplo01_pilhas {

	public static void main(String[] args) {
		Stack<String> carros = new Stack<>();
		
		carros.push("Golf");
		carros.push("Celta");
		carros.push("Fusion");
		carros.push("Fusca");
		carros.push("Camaro");
		
//		for(String c:carros) {
//			System.out.println(c);
//		}
		
		
		//retorna o topo da pilha
		System.out.println("Topo da pilha: " + carros.peek());
		
		
		//retorna o topo da pilha e retira ele da pilha
		System.out.println("Topo da pilha" + carros.peek());
		
		//retorna booleann, se a pilha está vazia ou não
		System.out.println("Pilha está vazia? " + (carros.empty()? "Sim!": "Não!"));
		
		//limpa a pilha
		carros.clear();
	}

}
