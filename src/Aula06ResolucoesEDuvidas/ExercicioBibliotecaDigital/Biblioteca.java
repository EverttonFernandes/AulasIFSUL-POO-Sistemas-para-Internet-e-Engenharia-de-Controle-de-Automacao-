package Aula06ResolucoesEDuvidas.ExercicioBibliotecaDigital;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> listaDeLivros = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public void adicionarLivros(Livro livro) {
        this.listaDeLivros.add(livro);
    }

    public void acessarInformacoesDeEstoqueETambemInformacoesDosLivros() {
        System.out.println("##########EXIBINDO INFORMAÇÕES##########");
        this.quantidadeDeLivrosNoEstoque();
        // Para cada livro que está dentro da lista de livros, eu vou usar um livro por vez (no laço foreach)
        // e fazer alguma determinada ação!
        for (Livro livro : this.listaDeLivros) {
            livro.exibirInformacoesDoLivro();
        }
    }

    public void quantidadeDeLivrosNoEstoque() {
        System.out.println("A biblioteca nomeada como "
                + this.getNome()
                + " possui no estoque "
                + this.getListaDeLivros().size() + "livros!");
    }
}
