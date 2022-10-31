package lista;

public class Programa {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
//		System.out.println(lista.getTamanho());
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("SC");
		lista.adicionar("RS");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Primeiro elemento: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo elemento: " + lista.getUltimo().getValor());
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(1).getValor());
		System.out.println(lista.get(2).getValor());
		System.out.println(lista.get(3).getValor());
		
	}
}
