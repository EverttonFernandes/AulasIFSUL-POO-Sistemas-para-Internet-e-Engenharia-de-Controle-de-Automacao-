package Aula04PraticaSobreSobrecargaDeMetodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();

        System.out.println(calculadora1.somar(5, 5));
        System.out.println(calculadora1.somar(5, 5, 10));
        System.out.println(calculadora1.somar(5.0, 5.0));
        System.out.println(calculadora1.somar(5.0F, 5.0F));

        System.out.println("############################################");

        Calculadora calculadoraDouble = new Calculadora(10.0, 10.0);
        System.out.println(calculadora1.somar(calculadoraDouble.getPrimeiroNumeroDouble(), calculadoraDouble.getPrimeiroNumeroDouble()));
    }
}
