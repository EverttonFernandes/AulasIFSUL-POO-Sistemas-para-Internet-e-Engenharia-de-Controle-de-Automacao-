public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Vermelho",
                "Jeep",
                2023,
                "KI9-8C66",
                "23ASAG8838D281",
                "281S78218DSDSAD218");

        System.out.println(carro1.cor);
        System.out.println(carro1.modelo);
        System.out.println(carro1.anoDeFabricacao);
        System.out.println(carro1.placa);
        System.out.println(carro1.getCodigoRenavan());
        System.out.println(carro1.getChassi());

    }
}