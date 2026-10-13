package livraria;

public class Livro extends Produto {
protected String autor;
protected int paginas;
    public Livro(int codigo, String nome, double preco, int estoque, String autor, int paginas) {
        super(codigo, nome, preco, estoque);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor(){
        return autor;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public boolean ehGrande(){
        boolean reallyBig = false;
        if(paginas >= 200){
            reallyBig = true;
        }
        return reallyBig;
    }

    
    
}


/*Parte téorica: 
A) O super é o construtor da classe pai ou super classe.Ele nos permite acessar os atributos da classe pai na classe filha.
Nesse caso, por meio do super podemos utilizar os atributos de Produto em Livro.
B) Porque os metodos foram recebidos na classe pai, ao fazer um extand, isso trouxe os metodos getNome() da classe pai
para a classe filha. Em resumo, funciona por conta da herança.
C) Lembra dos metodos anteriores? Tipo getter e setter. Então, o toString faz algo parecido, ele faz uma leitura do objeto.
Em java, cada classe faz uma leitura do objeto e cada objeto possuí um toString.
*/
