package lista;

public class Programa {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("SC");
		lista.adicionar("RS");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Primeiro elemento: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo elemento: " + lista.getUltimo().getValor());
		

		lista.remover("AC");
		System.out.println("Removeu o estado AC");
		lista.adicionar("SP");
		System.out.println("Adicionou o estado SP");
		
		for(int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
	}
}
