package aplicacao;

import exceptions.ExcecaoPilhaVazia;

public class Pilha<T> {
	private Lista<T> lista;
	
	public Pilha() {
		lista = new Lista<T>();
	}
	
	public boolean vazio() {
		return lista.vazio();
	}
	
	public void push(T valor) {
		Node<T> aux  = new Node<T>();
		aux.valor = valor;
		lista.insereTopo(aux);
	}
	
	public T pop() throws ExcecaoPilhaVazia{
		Node<T> aux = lista.retirarTopo();
                
		if(aux == null) {
			throw new ExcecaoPilhaVazia("Erro ao desempilhar");
		}
                
		return aux.valor;
	}

	public T topo() {
            if (lista.topo.valor == null){
                throw new NullPointerException("A pilha já está vazia");
            }
		return (T) lista.topo.valor;
	}
}
