package app;
import livraria.Livro;
public class AppLivro {
    public static void main(String[] args) {
    Livro livro = new Livro(2, "Java como programar", 200.0, 5,"Deitel", 1000);
    System.out.println(livro.getNome() + " de " + livro.getAutor());
    System.out.println("E caro? " + livro.ehCaro());
    System.out.println("E grande? " + livro.ehGrande());
    System.out.println(livro.toString());
    }
}
