public class PlacaInvalidaException extends RuntimeException {
    public PlacaInvalidaException(String placa) {
        super("Erro de Validação: A placa '" + placa + "' é inválida. A placa deve conter exatamente 7 caracteres.");
    }
}