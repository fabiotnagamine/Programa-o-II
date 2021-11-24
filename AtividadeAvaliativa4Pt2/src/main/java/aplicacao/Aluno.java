
package aplicacao;


public class Aluno<T> {
    private T Pilha;
    private T nome;

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }
    
}
