package Aula07PraticaClassesAbstratasEOPrincipioOCP.exemploCorretoDoOCP.abstracao;

public class Main {
    public static void main(String[] args) {
        PagamentoAbstrato pagamentoViaPix = new Pix("1234", 100.00);
        PagamentoAbstrato pagamentoViaCredito = new Credito(100.00, 500.00);

        pagamentoViaPix.efetuarPagamento();
        pagamentoViaCredito.efetuarPagamento();
    }
}
