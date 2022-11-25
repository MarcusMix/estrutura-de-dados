package prova2;

import prova2.Elemento;

public class Tree<TIPO extends Comparable> {
	
	private Elemento<TIPO> raiz;
	
	public Tree() {
		this.raiz = null;
	}
	
	public void adicionar(TIPO valor) {
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
		if(raiz == null) {
			this.raiz = novoElemento;
		} else {
			Elemento<TIPO> atual = this.raiz;
			while(true) {
				if(novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if(atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}
				} else { // se for maior ou igual
					if(atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}

	
	public Elemento<TIPO> getRaiz() {
		return raiz;
	}
	
	
	public void ordenarArvore(Elemento<TIPO> atual) {
		if(atual != null) {
			ordenarArvore(atual.getEsquerda());
			System.out.println(atual.getValor());
			ordenarArvore(atual.getDireita());
		}
	}
}
