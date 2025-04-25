package Aula05PraticaSobreEnums;

public enum TipoPagamento {
    BOLETO("Boleto"),
    CREDITO("Cartão Crédito"),
    DEBITO("Cartão de Débito"),
    DINHEIRO("Dinheiro"),
    PIX("Transferencia via Pix");

    private final String formaDePagamento;

    TipoPagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }
}
