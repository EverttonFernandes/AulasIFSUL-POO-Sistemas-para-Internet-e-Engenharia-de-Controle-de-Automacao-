public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Vermelho",
                "Jeep",
                2023,
                "KI9-8C66");

        System.out.println(carro1.cor);
        System.out.println(carro1.modelo);
        System.out.println(carro1.anoDeFabricacao);
        System.out.println(carro1.placa);

    }
}