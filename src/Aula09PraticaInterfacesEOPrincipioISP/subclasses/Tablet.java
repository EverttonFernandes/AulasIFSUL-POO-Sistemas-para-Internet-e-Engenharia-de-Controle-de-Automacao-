package Aula09PraticaInterfacesEOPrincipioISP.subclasses;

import Aula09PraticaInterfacesEOPrincipioISP.abstracao.DispositivoEletronico;

public class Tablet extends DispositivoEletronico {

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
}
