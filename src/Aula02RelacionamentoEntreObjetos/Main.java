package Aula02RelacionamentoEntreObjetos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor professora = new Professor("Joana");
        Aluno aluno1 = new Aluno("Matheus");
        Aluno aluno2 = new Aluno("Felipe");
        Aluno aluno3 = new Aluno("Barbara");

        List<Aluno> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(aluno1);
        listaDeAlunos.add(aluno2);
        listaDeAlunos.add(aluno3);

        Curso farmacia = new Curso("Farmacia", professora, listaDeAlunos);
        farmacia.adicionarAlunos(new Aluno("Gabrielli"));
        farmacia.removerAluno(aluno1);
        farmacia.removerAluno(aluno2);
        farmacia.mostrarInformacoesDoCurso();
    }
}
