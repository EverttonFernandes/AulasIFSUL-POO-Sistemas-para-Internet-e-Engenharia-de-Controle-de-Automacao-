public class Carro {
    public String cor;
    public String modelo;
    public int anoDeFabricacao;
    public String placa;
    private String codigoRenavan;
    private String chassi;

    public Carro(String cor, String modelo, int anoDeFabricacao, String placa, String codigoRenavan, String chassi) {
        this.cor = cor;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.placa = placa;
        this.codigoRenavan = codigoRenavan;
        this.chassi = chassi;
    }

    public String getCodigoRenavan(){
        return this.codigoRenavan;
    }

    public String getChassi(){
        return this.chassi;
    }




}
