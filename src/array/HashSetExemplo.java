package array;

import java.util.HashSet;

public class HashSetExemplo {

	public static void main(String[] args) {
		
		HashSet<String> tags = new HashSet<String>();
		tags.add("java");
		tags.add("programa��o");
		tags.add("poo");
		tags.add("java");
		for(String tag: tags) {
			System.out.println(tag);
		}
		
		//N�o aceita valores repetidos
	}

}
