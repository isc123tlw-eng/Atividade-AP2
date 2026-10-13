package livraria;

public class Item {
private Produto produto;
private int quantidade;

    public Item(Produto produto, int qtd){
    this.produto=produto;
    this.quantidade=qtd;
}
public Produto getProduto(){
return produto;
}
public int getQuantidade(){
return quantidade;
}
public double calcularValor(){
return produto.getPreco() * quantidade;
}
}
