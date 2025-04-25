package Aula05PraticaSobreEnums;

public class Pagamento {
    private TipoPagamento tipoPagamento;

    public Pagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
}
