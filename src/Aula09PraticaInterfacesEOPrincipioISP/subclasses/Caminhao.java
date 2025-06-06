package Aula09PraticaInterfacesEOPrincipioISP.subclasses;

import Aula09PraticaInterfacesEOPrincipioISP.interfaces.Abastecimento;
import Aula09PraticaInterfacesEOPrincipioISP.abstracao.Veiculo;

public class Caminhao extends Veiculo implements Abastecimento {

    @Override
    protected void ligar() {
        System.out.println("Ligando caminhao");
    }

    @Override
    protected void acelerar() {
        System.out.println("Acelerando caminhao");
    }

    @Override
    protected void buzinar() {
        System.out.println("Buzinando");
    }

    @Override
    protected void freiar() {
        System.out.println("Freiando");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastacendo");
    }
}
