import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
  public static void main(String args[]){
    ArrayList listaUnitaria = new ArrayList();
    ProdutoUnitario p1 = new ProdutoUnitario(7811001546L, "Leite", 4.75, 50);
    p1.adicionarEstoque(5);
    p1.vender(30);
    
    ProdutoUnitario p2 = new ProdutoUnitario(7952054484L, "Cafe", 11.50, 10)
    p2.vender(5);
    p2.adicionarEstoque(10);
    
    ProdutoUnitario p3 = new ProdutoUnitario(789000450L, "Chocolate", 11.50, 50);
    p3.vender(5);
    
    listaUnitaria.add(p1);
    listaUnitaria.add(p2);
    listaUnitaria.add(p3);
    
    ArrayList listaFracionada = new ArrayList();
    
    ProdutoFracionado pf1 = new ProdutoFracionado(1, "Laranja", 1.99, 51.5);
    pf1.vender(39.4);
    pf1.adicionarEstoque(25.5);
    
    System.out.println(listaUnitaria);
    System.out.println(ListaFracionada);
    Collections.sort(listaUnitaria,Comparator.comparingLong(Produto::getCodigo));
    Collections.sort(listaFracionada,Comparator.comparingLong(Produto::getCodigo));
    
    System.out.println(listaUnitaria);
    
  }
}
