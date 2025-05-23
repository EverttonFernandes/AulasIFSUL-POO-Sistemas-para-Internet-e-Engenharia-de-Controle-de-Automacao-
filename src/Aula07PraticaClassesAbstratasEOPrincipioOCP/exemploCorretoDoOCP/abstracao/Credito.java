package Aula07PraticaClassesAbstratasEOPrincipioOCP.exemploCorretoDoOCP.abstracao;

public class Credito extends PagamentoAbstrato {
    private Double valorDoPagamento;
    private Double limiteCartaoDeCredito;

    public Credito(Double valorDoPagamento, Double limiteCartaoDeCredito) {
        this.valorDoPagamento = valorDoPagamento;
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
    }

    public Double getValorDoPagamento() {
        return valorDoPagamento;
    }

    public Double getLimiteCartaoDeCredito() {
        return limiteCartaoDeCredito;
    }

    @Override
    public void efetuarPagamento() {
        if (this.getValorDoPagamento() <= this.getLimiteCartaoDeCredito()) {
            this.limiteCartaoDeCredito -= this.valorDoPagamento;
            System.out.println("Pagamento via credito");
        }
    }
}
