package Aula02RelacionamentoEntreObjetos;

import java.util.List;

public class Curso {
    String nomeDoCurso;
    private Professor professor;
    private List<Aluno> aluno;

    public Curso(String nomeDoCurso, Professor professor, List<Aluno> aluno) {
        this.nomeDoCurso = nomeDoCurso;
        this.professor = professor;
        this.aluno = aluno;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void adicionarAlunos(Aluno aluno) {
        this.aluno.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.aluno.remove(aluno);
    }

    public void mostrarInformacoesDoCurso() {
        System.out.println("Primeira turma do curso de "
                .concat(this.getNomeDoCurso())
                .concat(" com a professora ")
                .concat(this.getProfessor().getNomeDoProfessor())
                .concat(" com ")
                .concat(String.valueOf(this.getAluno().size()))
                .concat(" alunos inscritos"));
    }
}
