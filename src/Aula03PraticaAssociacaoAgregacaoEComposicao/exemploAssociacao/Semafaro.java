package Aula03PraticaAssociacaoAgregacaoEComposicao.exemploAssociacao;

import java.util.ArrayList;
import java.util.List;

public class Semafaro {
    private List<String> cores = new ArrayList<>();

    public Semafaro(List<String> cores) {
        this.cores = cores;
    }
}
