package Aula08PraticaHerancaPolimorfismoEOPrincipioLSP.exemploPraticoIdeal;

import java.util.List;

public class CursoGraduacao extends Curso {

    protected CursoGraduacao(String nome, int cargaHoraria, String grauDeEnsino, boolean temTrabalhoDeConclusaoDeCurso) {
        super(nome, cargaHoraria, grauDeEnsino, temTrabalhoDeConclusaoDeCurso);
    }

    @Override
    protected String emitirDiploma() {
        return "Diploma emitido com sucesso";
    }

    @Override
    protected void adicionarDisciplina(String disciplina) {
        this.disciplinas.add(disciplina);
    }

    @Override
    protected List<String> listarDisciplinas() {
        return disciplinas;
    }

    @Override
    protected void exibirInformacoes() {
        System.out.println(this.nome);
        System.out.println(this.cargaHoraria);
        System.out.println(this.grauDeEnsino);

        if (this.temTrabalhoDeConclusaoDeCurso) {
            System.out.println("Possui trabalho de conclusão");
        } else {
            System.out.println("Não possui trabalho de conclusão");
        }

        for (String disciplina : this.disciplinas) {
            System.out.println(disciplina);
        }

    }
}
