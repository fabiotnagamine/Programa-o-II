package aplicacao;

import exceptions.ExcecaoPilhaVazia;

public class Main {

	public static void main(String[] args) throws ExcecaoPilhaVazia {
		
		Pilha<String> p = new Pilha<String>();
		try {
			p.push("alguem");
			p.push("Um lugar");
			p.pop();
			p.pop();
			p.pop();
		}
		catch(ExcecaoPilhaVazia e) {
			System.out.println("A pilha já está vazia");
		}
	}

}
