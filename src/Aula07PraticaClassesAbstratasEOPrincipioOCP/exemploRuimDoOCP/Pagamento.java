package Aula07PraticaClassesAbstratasEOPrincipioOCP.exemploRuimDoOCP;

import java.time.LocalDateTime;

public class Pagamento {
    private String chavePixDestinatario;
    private Double valorDoPagamento;
    private Double limiteCartaoDeCredito;
    private String tipoPagamento;
    private LocalDateTime dataPagamento;

    public Pagamento(Double valorDoPagamento, String chavePixDestinatario, String tipoPagamento) {
        this.valorDoPagamento = valorDoPagamento;
        this.chavePixDestinatario = chavePixDestinatario;
        this.tipoPagamento = tipoPagamento;
    }

    public Pagamento(Double valorDoPagamento, Double limiteCartaoDeCredito, String tipoPagamento) {
        this.valorDoPagamento = valorDoPagamento;
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
        this.tipoPagamento = tipoPagamento;
    }

    public String getChavePixDestinatario() {
        return chavePixDestinatario;
    }

    public Double getValorDoPagamento() {
        return valorDoPagamento;
    }

    public Double getLimiteCartaoDeCredito() {
        return limiteCartaoDeCredito;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void efetuarPagamento() {
        if (this.getTipoPagamento().equals("Pix")) {
            if (this.getValorDoPagamento() != null && !this.getChavePixDestinatario().isEmpty()) {
                System.out.println("Executando pagamento via pix");
            }
        }

        if (this.getTipoPagamento().equals("Credito")) {
            if (this.getValorDoPagamento() <= this.getLimiteCartaoDeCredito()) {
                this.limiteCartaoDeCredito -= this.valorDoPagamento;
                System.out.println("Pagamento via credito");
            }
        }

        if (this.getTipoPagamento().equals("Debito")) {
            System.out.println("Pagamento no debito");
        }

        if (this.getTipoPagamento().equals("Boleto")) {
            System.out.println("Pagamento no boleto");
        }
    }

}
