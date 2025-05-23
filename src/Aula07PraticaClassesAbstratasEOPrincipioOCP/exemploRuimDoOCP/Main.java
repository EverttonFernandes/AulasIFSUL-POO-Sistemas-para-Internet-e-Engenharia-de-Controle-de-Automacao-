package Aula07PraticaClassesAbstratasEOPrincipioOCP.exemploRuimDoOCP;

public class Main {
    public static void main(String[] args) {
//        Pagamento pagamentoViaPix = new Pagamento(100.00, "1234", "Pix");
//        pagamentoViaPix.efetuarPagamento();

        Pagamento pagamentoViaCredito = new Pagamento(100.00, 500.00, "Credito");
        pagamentoViaCredito.efetuarPagamento();


    }
}
