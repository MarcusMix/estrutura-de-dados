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
		
		//retorna booleann, se a pilha est� vazia ou n�o
		System.out.println("Pilha est� vazia? " + (carros.empty()? "Sim!": "N�o!"));
		
		//limpa a pilha
		carros.clear();
	}

}
