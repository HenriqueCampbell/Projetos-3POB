package model;

public class PlacaInvalidaException extends RuntimeException {
    public PlacaInvalidaException(String placa) {
        super("Erro de Validação: A placa '" + placa + "' é inválida! Deve conter exatamente 7 caracteres.");
    }
}