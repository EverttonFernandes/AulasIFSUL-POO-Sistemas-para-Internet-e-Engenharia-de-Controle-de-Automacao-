package Aula09PraticaInterfacesEOPrincipioISP.subclasses;

import Aula09PraticaInterfacesEOPrincipioISP.interfaces.Abastecimento;
import Aula09PraticaInterfacesEOPrincipioISP.interfaces.ConectaWifi;
import Aula09PraticaInterfacesEOPrincipioISP.interfaces.ConectarBluetooth;
import Aula09PraticaInterfacesEOPrincipioISP.abstracao.Veiculo;

public class Carro extends Veiculo implements ConectaWifi, ConectarBluetooth, Abastecimento {

    @Override
    protected void ligar() {
        System.out.println("Ligando carro");
    }

    @Override
    protected void acelerar() {
        System.out.println("Acelerando carro");
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
    public void ligaWifi() {
        System.out.println("Conectando no wifi");
    }

    @Override
    public void ligaBluetooth() {
        System.out.println("Liga bluetooth");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo");
    }
}
