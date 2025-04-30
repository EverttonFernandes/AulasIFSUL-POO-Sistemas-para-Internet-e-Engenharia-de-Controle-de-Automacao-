package Aula06ResolucoesEDuvidas.ExercicioBibliotecaDigital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da biblioteca");
        String nomeDaBiblioteca = scanner.nextLine();

        Biblioteca biblioteca = new Biblioteca(nomeDaBiblioteca);

        System.out.println("Informe nome do Autor");
        String nomeDoAutor = scanner.nextLine();

        System.out.println("Informe a nacionalidade do Autor");
        String nacionalidadeDoAutor = scanner.nextLine();

        Autor autor = new Autor(nomeDoAutor, nacionalidadeDoAutor);

        System.out.println("Informe o titulo do livro");
        String tituloDoLivro = scanner.nextLine();

        System.out.println("Informe o ano de publicação do livro");
        int anoDePublicacao = scanner.nextInt();

        Livro livro = new Livro(tituloDoLivro, anoDePublicacao, autor);
        Livro livro2 = new Livro("Livro 2", anoDePublicacao, autor);
        Livro livro3 = new Livro("Livro 3", anoDePublicacao, autor);
        biblioteca.adicionarLivros(livro);
        biblioteca.adicionarLivros(livro2);
        biblioteca.adicionarLivros(livro3);

        biblioteca.acessarInformacoesDeEstoqueETambemInformacoesDosLivros();

    }
}
