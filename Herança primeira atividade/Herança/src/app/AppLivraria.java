package app;
import livraria.Papelaria;
import livraria.Produto;
public class AppLivraria {
public static void main(String[] args) {
Produto p = new Produto(1, "Mochila", 150.0, 8);
System.out.println(p.getNome() + "é caro? " + p.ehCaro());

Papelaria caneta = new Papelaria(3, "Caneta azul", 3.5, 100, "Esferográfica 1.0 mm", "BIC");
System.out.println(caneta.listarEtiqueta());
    }
}
