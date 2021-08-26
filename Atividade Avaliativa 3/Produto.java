public abstract class Produto{
  private long codigo;
  private String nome;
  private double preco;
  
  public Produto(){
    codigo = 0;
    nome   = "";
    preco  = 0.0;
  }
  
  public Produto(long cod, String nome, double price){
    this.codigo = cod;
    this.nome = nome;
    this.preço = price;
  }
  
  public long getCodigo(){
    return codigo;
  }
  
  public void setCodigo(long codigo){
    this.codigo = codigo;
  }
  
  public String getNome(){
    return nome;
  }
  
  public void setNome(){
    this.nome = nome;
  }
  
  public double getPreco(){
    return preco;
  }
  
  public void setPreco(double preco){
    this.preco = preco;
  }
  
  @Override
  public String toString(){
    return 
    "\nCodigo= " +codigo+ "\nNome= " + nome + "\nPreço= " + preco;
  }
}
