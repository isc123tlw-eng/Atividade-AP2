package livraria;

public class LivroDidatico extends Livro{
    private  String disciplina;
    public LivroDidatico(int codigo, String nome, double preco, int estoque, String autor, int paginas, String disciplina){
        super(codigo, nome, preco, estoque, autor, paginas);
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
}
