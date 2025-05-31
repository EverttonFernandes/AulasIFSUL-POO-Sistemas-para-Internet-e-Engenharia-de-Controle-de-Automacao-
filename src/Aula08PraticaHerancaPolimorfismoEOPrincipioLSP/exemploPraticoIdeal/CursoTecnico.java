package Aula08PraticaHerancaPolimorfismoEOPrincipioLSP.exemploPraticoIdeal;

import java.util.List;

public class CursoTecnico extends Curso{

    // SE QUISEREM CONCLUIR A CLASSE CURSO TECNICO (FIQUEM A VONTADE)
    protected CursoTecnico(String nome, int cargaHoraria, String grauDeEnsino, boolean temTrabalhoDeConclusaoDeCurso) {
        super(nome, cargaHoraria, grauDeEnsino, temTrabalhoDeConclusaoDeCurso);
    }

    @Override
    protected String emitirDiploma() {
        return "";
    }

    @Override
    protected void adicionarDisciplina(String disciplina) {

    }

    @Override
    protected List<String> listarDisciplinas() {
        return List.of();
    }

    @Override
    protected void exibirInformacoes() {

    }
}
