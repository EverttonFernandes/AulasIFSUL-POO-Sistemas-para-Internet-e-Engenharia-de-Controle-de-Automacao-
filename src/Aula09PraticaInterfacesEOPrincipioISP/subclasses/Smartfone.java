package Aula09PraticaInterfacesEOPrincipioISP.subclasses;

import Aula09PraticaInterfacesEOPrincipioISP.interfaces.ConectaWifi;
import Aula09PraticaInterfacesEOPrincipioISP.abstracao.DispositivoEletronico;

public class Smartfone extends DispositivoEletronico implements ConectaWifi {

    @Override
    protected void carrega() {
        System.out.printf("Esta carregando");
    }

    @Override
    protected void inicializaSistemaOperacional() {
        System.out.printf("Esta inicializando o SO");
    }

    @Override
    protected void desliga() {
        System.out.println("Vai desligar");
    }

    @Override
    public void ligaWifi() {
        System.out.println("Ligando wifi");
    }
}
