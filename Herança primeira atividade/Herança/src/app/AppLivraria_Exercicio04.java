package app;
import java.util.ArrayList;
import livraria.Livro;
import livraria.LivroDidatico;
import livraria.Papelaria;
import livraria.Produto;

public class AppLivraria_Exercicio04 {
    public static void main(String[] args) {
    ArrayList<Produto> produtos = new ArrayList();
    String resultado= " ";
    produtos.add(new Livro (3,"Java Como Programar", 200.0,5,"Deitel", 1000));
    produtos.add(new Produto(4,"Lapis preto", 2.0,50));
    produtos.add(new Papelaria(5, "Caneta azul", 3.5, 100,"Esferográfica 1.0 mm&","BIC"));
    produtos.add(new Livro (6,"A hora da estrela",43.0, 7,"Clarice Lispector",120));
    produtos.add(new LivroDidatico(4, "Java Como Programar", 40.00, 5, "Deitel", 4000, "AP2"));
    for (int i=0; i < produtos.size(); i++){
    resultado = resultado + produtos.get(i).listar()+ "\n--------\n";
    }
    System.out.println(resultado);
        }
    }

