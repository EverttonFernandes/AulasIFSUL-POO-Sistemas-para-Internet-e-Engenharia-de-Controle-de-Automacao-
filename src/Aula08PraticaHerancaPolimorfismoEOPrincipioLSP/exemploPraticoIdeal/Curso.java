package Aula08PraticaHerancaPolimorfismoEOPrincipioLSP.exemploPraticoIdeal;

import java.util.ArrayList;
import java.util.List;

public abstract class Curso {
    protected String nome;
    protected int cargaHoraria;
    protected String grauDeEnsino;
    protected boolean temTrabalhoDeConclusaoDeCurso;
    protected List<String> disciplinas;

    // Herança: Construtores protegidos para serem usados pelas subclasses
    protected Curso(String nome, int cargaHoraria, String grauDeEnsino, boolean temTrabalhoDeConclusaoDeCurso) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.grauDeEnsino = grauDeEnsino;
        this.temTrabalhoDeConclusaoDeCurso = temTrabalhoDeConclusaoDeCurso;
        this.disciplinas = new ArrayList<>();
    }

    // Herança: Método abstrato que deve ser implementado pelas subclasses
    protected abstract String emitirDiploma();

    // Herança: Método comum para adicionar disciplinas
    protected abstract void adicionarDisciplina(String disciplina);

    // Herança: Método comum para listar disciplinas
    protected abstract List<String> listarDisciplinas();

    // Herança: Método comum para exibir informações do curso
    protected abstract void exibirInformacoes();
}
