package aplicacao;

import exceptions.ExcecaoPilhaVazia;
import javafx.scene.control.Alert;

public class Pilha<T> {
    private Pilha auxs;
    private Lista<T> lista;
  

    public Pilha() {
        lista = new Lista<T>();
    }

    public boolean vazio() {
        return lista.vazio();
    }

    public void push(T valor) {
        Node<T> aux = new Node<T>();
        aux.valor = valor;
        lista.insereTopo(aux);
    }

    public T pop() throws ExcecaoPilhaVazia {
        Node<T> aux= lista.retirarTopo();

        if (aux == null) {
            throw new ExcecaoPilhaVazia("A pilha já está vazia");
        }
        
        return aux.valor;
    }

    public T topo() throws ExcecaoPilhaVazia {
        if (lista.vazio()) {
            throw new ExcecaoPilhaVazia("A pilha já está vazia");
        } else {
            return (T) lista.topo.valor;
        }
    }
}
