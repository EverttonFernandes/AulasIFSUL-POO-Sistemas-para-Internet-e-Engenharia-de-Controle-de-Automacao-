package Aula03PraticaAssociacaoAgregacaoEComposicao.exemploAssociacao;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cores = Arrays.asList("Verde", "Vermelho", "Amarelo");
        Semafaro semafaro1 = new Semafaro(cores);
        Semafaro semafaro2 = new Semafaro(cores);

        // O exemplo de associação seria os carros na avenida
        Motor motorDoisPontoZero = new Motor("2.0");
        Carro carro1 = new Carro("preto", "Renault", motorDoisPontoZero);

        // Agregação (dado que essa avenida um dia existiu sem os semafaros
        List<Semafaro> semafaros = Arrays.asList(semafaro1, semafaro2);
        Avenida avenida = new Avenida("Avenida Rio Branco");
        avenida.setSemafaro(semafaros);
        avenida.adicionarSemafaros(new Semafaro(cores));
        avenida.adicionarCarro(carro1);

        // exemplo de composição (o carro não existe sem o motor!);
        Motor motor = new Motor("2.0");
        Carro carro = new Carro("preto", "Renault", motor);
    }
}
