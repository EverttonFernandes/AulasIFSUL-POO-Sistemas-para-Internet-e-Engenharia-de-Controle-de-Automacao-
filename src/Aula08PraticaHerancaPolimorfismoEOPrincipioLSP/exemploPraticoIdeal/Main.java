package Aula08PraticaHerancaPolimorfismoEOPrincipioLSP.exemploPraticoIdeal;

public class Main {
    public static void main(String[] args) {
        CursoGraduacao cursoGraduacao = new CursoGraduacao("TSI", 500, "Superior", true);

        cursoGraduacao.adicionarDisciplina("POO");
        cursoGraduacao.adicionarDisciplina("Banco de dados");
        cursoGraduacao.listarDisciplinas();
        cursoGraduacao.exibirInformacoes();
        cursoGraduacao.emitirDiploma();

    }
}
