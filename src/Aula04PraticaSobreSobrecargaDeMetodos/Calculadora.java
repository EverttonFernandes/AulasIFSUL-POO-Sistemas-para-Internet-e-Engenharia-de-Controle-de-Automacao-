package Aula04PraticaSobreSobrecargaDeMetodos;

public class Calculadora {
    private int primeiroNumero;
    private int segundoNumero;
    private Double primeiroNumeroDouble;
    private Double segundoNumeroDouble;
    private Float primeiroNumeroFloat;
    private Float segundoNumeroFloat;

    public Calculadora() {
    }

    public Calculadora(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public Calculadora(Double primeiroNumero, Double segundoNumero) {
        this.primeiroNumeroDouble = primeiroNumero;
        this.segundoNumeroDouble = segundoNumero;
    }

    public Calculadora(Float primeiroNumero, Float segundoNumero) {
        this.primeiroNumeroFloat = primeiroNumero;
        this.segundoNumeroFloat = segundoNumero;
    }

    public int somar(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public int somar(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        return primeiroNumero + segundoNumero + terceiroNumero;
    }

    public Double somar(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public Float somar(Float primeiroNumero, Float segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public Double getPrimeiroNumeroDouble() {
        return primeiroNumeroDouble;
    }

    public Double getSegundoNumeroDouble() {
        return segundoNumeroDouble;
    }
}
