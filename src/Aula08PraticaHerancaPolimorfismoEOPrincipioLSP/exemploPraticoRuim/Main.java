package Aula08PraticaHerancaPolimorfismoEOPrincipioLSP.exemploPraticoRuim;

public class Main {
    public static void main(String[] args) {

        // INFRAÇÃO DO PRINCIPIO LSP, POIS NÃO ESTÁ RESPEITANDO PRÉ CONDIÇÕES ESTABELECIDAS PELA CLASSE PAI
        Palestra palestra = new Palestra("Palestra Sobre POO", 3, null, false);
        palestra.listarDisciplinas();
        palestra.exibirInformacoes();

    }
}
