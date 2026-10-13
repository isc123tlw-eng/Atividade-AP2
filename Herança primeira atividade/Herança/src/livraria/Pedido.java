package livraria;
import java.util.ArrayList;

public class Pedido {
private ArrayList<Item> itens;
private int codigo;
private String data;

    public Pedido (int codigo, String data){
    this.codigo=codigo;
    this.data=data;
    this.itens = new ArrayList();
    }
    
public void addItem(Produto p, int qtd){
itens.add(new Item(p, qtd));
}
public String getData(){
return data;
}
public int getCodigo(){
return codigo;
}
public double calcularTotal(){
double total=0;
for (Item i: itens){
total += i.calcularValor();
}
return total;
}
}
