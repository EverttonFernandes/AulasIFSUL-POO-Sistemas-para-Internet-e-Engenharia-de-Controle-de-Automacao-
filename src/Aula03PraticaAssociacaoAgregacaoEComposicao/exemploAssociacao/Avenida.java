package Aula03PraticaAssociacaoAgregacaoEComposicao.exemploAssociacao;

import java.util.List;

public class Avenida {
    private String nomeDaAvenida;
    private List<Semafaro> semafaro;
    private List<Carro> carros;

    public Avenida(String nomeDaAvenida) {
        this.nomeDaAvenida = nomeDaAvenida;
    }

    public void setSemafaro(List<Semafaro> semafaro) {
        this.semafaro = semafaro;
    }

    public void adicionarSemafaros(Semafaro semafaro){
        this.semafaro.add(semafaro);
    }

    public void adicionarCarro(Carro carro) {
        this.carros.add(carro);
    }
}
