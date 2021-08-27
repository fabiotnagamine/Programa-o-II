public class ProdutoFracionado extends Produto implements IProduto{
	private double estoque;
	private double valor;
	
	public ProdutoFracionado(){
		super();
		this.estoque = 0;
	}
	
	public ProdutoFracionado(int cod, String nome, double preco, double estoque){
		super(cod, nome, preco);
		this.estoque = estoque;
	}
	
	public double getValor(){
		return valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public void adicionarEstoque(double qtd){
		estoque += qtd;
	}
	
	public double vender(double qtd){
		estoque -= qtd;
		valor = getPreco() * qtd;
		returm valor;
	}
	
	public double getEstoque(){
		return estoque;
	}
	
	public void setEstoque(double estoque){
		this.estoque = estoque;
	}
	
	@Override
	public double CalcularValorEmEstoque(){
		return estoque * getpreco();
	}
	
	@Override
	public String toString(){
		return "\n" + super.toString() + "\nEstoque =" + estoque + "\nUnidades de valor" + "\n Valor em estoque R$: " + CalcularValorEmEstoque()
					 + "\nValor total em que vendeu R$:" + getValor();
	}
}
