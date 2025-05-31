package Aula08PraticaHerancaPolimorfismoEOPrincipioLSP.exemploPraticoRuim;

import Aula08PraticaHerancaPolimorfismoEOPrincipioLSP.exemploPraticoIdeal.Curso;

import java.util.List;

public class Palestra extends Curso {

    // ESSA CLASSE ESTÁ DISREIPEITANDO O PRINCIPIO LSP, POIS NÃO RESPEITA ÀS PRÉ CONDIÇÕES DA SUPERCLASSE - CURSO!
    protected Palestra(String nome, int cargaHoraria, String grauDeEnsino, boolean temTrabalhoDeConclusaoDeCurso) {
        super(nome, cargaHoraria, grauDeEnsino, temTrabalhoDeConclusaoDeCurso);
    }

    @Override
    protected String emitirDiploma() {
        throw new UnsupportedOperationException("Não emite diploma");
    }

    @Override
    protected void adicionarDisciplina(String disciplina) {
        throw new UnsupportedOperationException("Não adiciona disciplina");
    }

    @Override
    protected List<String> listarDisciplinas() {
        throw new UnsupportedOperationException("Não tem disciplinas para listar");
    }

    @Override
    protected void exibirInformacoes() {
        System.out.printf("Exibir informacoes da paletra");
    }
}
