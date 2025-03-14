public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Vermelho",
                "Jeep",
                2023,
                "KI9-8C66",
                "23ASAG8838D281",
                "281S78218DSDSAD218");

        System.out.println("Foi criado um carro na cor " + carro1.cor +
                " no modelo " + carro1.modelo +
                " com o ano de fabricacao " + carro1.anoDeFabricacao +
                " com a placa " + carro1.placa +
                " com o codigo renava " + carro1.getCodigoRenavan() +
                " e com o chassi " + carro1.getChassi());

    }
}