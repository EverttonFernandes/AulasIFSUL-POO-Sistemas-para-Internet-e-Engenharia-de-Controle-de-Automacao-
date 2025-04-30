package Aula06ResolucoesEDuvidas.ExercicioBibliotecaDigital;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Autor autor; // exemplo real de uma composição (pois não existem livros sem autores)

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void exibirInformacoesDoLivro() {
        System.out.println("---------------------");
        System.out.println("O livro " + this.getTitulo()
                + " que foi publicado ano ano "
                + this.getAnoPublicacao()
                + " pertence ao autor(a) " + this.getAutor().getNome() + "!");
    }
}
