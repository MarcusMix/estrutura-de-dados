package array;

import java.util.HashMap;
import java.util.Map;

public class HashMapExemplo {

	public static void main(String[] args) {
		HashMap<Integer, String> produtos = new HashMap<>();
		produtos.put(1, "Banana");
		produtos.put(2, "Laranja");
		produtos.put(3, "Maça");
		produtos.put(4, "Melão");
		produtos.put(5, "Uva");
		produtos.put(6, "Pessego");
		
		// Imprimir da forma tradicional
//		for(String p: produtos.values()) {
//			System.out.println(p);
//		}
		
		// Imprimir a key e o valor
		for(Map.Entry<Integer, String> produto : produtos.entrySet()) {
			System.out.format("%d: %s%n", produto.getKey(), produto.getValue());
		}
	}

}
