package Aula07PraticaClassesAbstratasEOPrincipioOCP.exemploCorretoDoOCP.abstracao;

public class Pix extends PagamentoAbstrato {
    private String chavePixDestinatario;
    private Double valorDoPagamento;

    public Pix(String chavePixDestinatario, Double valorDoPagamento) {
        this.chavePixDestinatario = chavePixDestinatario;
        this.valorDoPagamento = valorDoPagamento;
    }

    public String getChavePixDestinatario() {
        return chavePixDestinatario;
    }

    public Double getValorDoPagamento() {
        return valorDoPagamento;
    }

    @Override
    public void efetuarPagamento() {
        if (this.getValorDoPagamento() != null && !this.getChavePixDestinatario().isEmpty()) {
            System.out.println("Executando pagamento via pix");
        }
    }
}
