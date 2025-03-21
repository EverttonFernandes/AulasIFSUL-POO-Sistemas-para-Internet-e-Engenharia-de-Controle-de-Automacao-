package Aula01ExercicioLivros;

public class Livro {
    String titulo;
    String autor;
    int anoDePublicacao;
    boolean estaDisponivel;
    double preco;

    public Livro(String titulo, String autor, int anoDePublicacao, boolean estaDisponivel, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.estaDisponivel = estaDisponivel;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public boolean isEstaDisponivel() {
        return estaDisponivel;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrarPrecoSeEstiverDisponivel() {
        if (this.isEstaDisponivel()) {
            System.out.println(this.getPreco());
        }
    }

    public void mostrarInformacoesSeEstiverDisponivel() {
        if (this.isEstaDisponivel()) {
            System.out.println("Livro nomeado como "
                            .concat(this.getTitulo())
                            .concat(" do autor "
                            .concat(this.getAutor())
                            .concat(" publicado no ano ")
                            .concat(String.valueOf(this.getAnoDePublicacao()))
                            .concat(" ao qual seu preco e ")
                            .concat(String.valueOf(this.getPreco())).concat("R$")));
        }
    }
}
