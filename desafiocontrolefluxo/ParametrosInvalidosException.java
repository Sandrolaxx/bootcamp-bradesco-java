package desafiocontrolefluxo;

public class ParametrosInvalidosException extends RuntimeException {

    public ParametrosInvalidosException(String message) {
        super("Parâmetro inválido: ".concat(message));
    }

}
