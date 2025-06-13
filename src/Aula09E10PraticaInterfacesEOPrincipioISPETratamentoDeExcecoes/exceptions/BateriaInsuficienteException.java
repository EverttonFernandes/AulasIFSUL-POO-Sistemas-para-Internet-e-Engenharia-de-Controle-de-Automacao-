package Aula09E10PraticaInterfacesEOPrincipioISPETratamentoDeExcecoes.exceptions;

public class BateriaInsuficienteException extends RuntimeException{
    public BateriaInsuficienteException(String message) {
        super(message);
    }
}
