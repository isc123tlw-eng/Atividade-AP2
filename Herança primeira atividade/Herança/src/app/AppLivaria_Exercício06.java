package app;
import java.util.ArrayList;
import java.util.Scanner;
import livraria.Livro;
import livraria.Papelaria;
import livraria.Produto;

public class AppLivaria_Exercício06 {
     
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        cadastrarProduto(produtos);
        
        ArrayList<Produto> pedidos = new ArrayList<>();
        System.out.println("Qual produto desseja?");
        for(Produto p: produtos){
            p.listar();
        }
        System.out.println("Quantidade: ");
        int quant = sc.nextInt();
        
    }
    public static void cadastrarProduto(ArrayList<Produto> produtos){
        int escolha = 0;
        Scanner sc = new Scanner(System.in);
      
        do{
        System.out.println("Que tipo de produto gostaria de criar? (1 = livro e 2 = papelaria)");
        escolha = sc.nextInt();
        switch (escolha) {
    case 1:
        System.out.println("Digite o codigo do livro");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do livro");
        String nome = sc.nextLine();
        System.out.println("Digite o preco do livro");
        double preco = sc.nextDouble();
        sc.nextLine();
        System.out.println("Quantos livros tem no estoque?");
        int estoque = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do autor");
        String autor = sc.nextLine();
        System.out.println("Digite o numero de paginas");
        int paginas = sc.nextInt();
        sc.nextLine();
        Livro livro = new Livro(codigo, nome, preco, estoque, autor, paginas);
        produtos.add(livro);
        break;
    case 2:
        System.out.println("Digite o codigo do produto?");
        int codigoP = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do produto?");
        String nomeP = sc.nextLine();
        System.out.println("Digite o preco do produto?");
        double precoP = sc.nextDouble();
        sc.nextLine();
        System.out.println("Quantidade no estoque?");
        int estoqueP = sc.nextInt();
        sc.nextLine();
        System.out.println("Descricao do produto:");
        String descricao = sc.nextLine();
        System.out.println("Fabricante:");
        String fabricante = sc.nextLine();
        Papelaria papelaria = new Papelaria(codigoP, nomeP, precoP, estoqueP, descricao, fabricante);
        produtos.add(papelaria);
        papelaria.listarEtiqueta();
        break;
    default:
        System.out.println("ERRO. Tente novamente mais tarde.");
            }
        }while(escolha >= 1  && escolha <= 2);
        }
    }