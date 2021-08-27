public class ProdutoUnitario extends Prdouto implements Iproduto{
  private long estoque;
  private double valor;
  
  public ProdutoUnitario(){
    super();
    this.estoque = 0;
  }
  
  public ProdutoUnitario(long cod, String nome, double preco, long estoque){
    super(cod, nome, preco);
    this.estoque = estoque;
  }
  
  public void adicionarEstoque(long qtd){
    estoque += qtd;
  }
  
  public double vender(long qtd){
    estoque -= qtd;
    valor = getPreco() * qtd;
    return valor;
  }
  
  public double getValor(){
    return valor;
  }
  
  public void setValor(double valor){
    this.valor=  valor;
  }
  
  @Override
  public double CalcularValorEmEstoque(){
    return getPreco() * estoque;
  }
  
  public long getEstoque(){
    return estoque;
  }
  
  @Override
  public String toString(){
    return "\n" + super.toString() + "\nEstoque =" + estoque + "Unidades" + "\nValor em estoque R$: " + CalcularValorEmEstoque() + 
           "\nValor total que vendeu R$: " + getValor();
  }
}
