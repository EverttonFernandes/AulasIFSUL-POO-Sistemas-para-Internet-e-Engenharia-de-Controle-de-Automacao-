package Aula03PraticaAssociacaoAgregacaoEComposicao.exemploAssociacao;

public class Carro {
    private String cor;
    private String modelo;
    private Motor motor;

    public Carro(String cor, String modelo, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }
}
