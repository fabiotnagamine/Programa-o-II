package aplicacao;

public class Lista<T> {
	
	protected Node<T> topo;
	protected Integer tamanho;
	
	public Lista() {
		tamanho = 0;
		topo = null;
	}
	
	public boolean vazio(){
		return tamanho == 0;
	}
	
	public Integer tamanho() {
		return tamanho;
	}
	
	public void insereTopo(Node<T> n) {
		n.proximo = topo;
		tamanho = tamanho + 1;
		topo = n;
	}
	
	public Node<T> retirarTopo(){
		Node<T> aux =  topo;
		if (!vazio()) {
			topo = topo.proximo;
			tamanho = tamanho - 1;
		}
		return aux;
	}
	
	
}
