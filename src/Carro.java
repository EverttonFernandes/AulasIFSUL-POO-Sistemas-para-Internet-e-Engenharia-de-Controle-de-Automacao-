public class Carro {
    public String cor;
    public String modelo;
    public int anoDeFabricacao;
    public String placa;
    private String codigoRenavan;
    private String chassi;
    private String tipoDoVolante;
    public boolean ligado;
    
    public Carro(String cor, String modelo, int anoDeFabricacao, String placa, String codigoRenavan, String chassi, String tipoDoVolante) {
        this.cor = cor;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.placa = placa;
        this.codigoRenavan = codigoRenavan;
        this.chassi = chassi;
        this.tipoDoVolante = tipoDoVolante;
    }

    public String getCodigoRenavan(){
        return this.codigoRenavan;
    }

    public String getChassi(){
        return this.chassi;
    }

    public String getTipoDoVolante() {
        return tipoDoVolante;
    }

    public void setTipoDoVolante (String tipoDoVolante){
        this.tipoDoVolante = tipoDoVolante;
    }

}
