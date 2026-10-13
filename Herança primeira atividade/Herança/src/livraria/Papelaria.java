package livraria;

public class Papelaria extends Produto {
    private String descricao;
    private String fabricante;

    public Papelaria(int codigo, String nome, double preco, int estoque, String descricao, String fabricante) {
    super(codigo, nome, preco, estoque);
    this.descricao = descricao;
    this.fabricante = fabricante;
    }
;

    public String listarEtiqueta() {
    return getNome() + " - " + fabricante + " - R$ " + getPreco();
    }
    

}

/*Parte teorica:
A) Como Papelaria está herdando atributos da classe pai, Produto, então Papelaria pode usar não somente os atrbitos herdados
da classe Produto, mas também seus respectivos getters e setters.

B)Ao trocar protected para private, não conseguimos acessar nome e preco, pois o atributo está privado. Então mesmo que
a classe Papelaria esteja herdando os atributos da classe Produto, não conseguimos acessar nome e preço nessa parte do codigo.
No entanto, podemos voltar a utilizar nome e preco ao reescrevermos essa parte do codigo usando os getters.
*/

