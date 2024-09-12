class CepInvalidoException extends Exception {
    public CepInvalidoException() {
        super("CEP inválido. O CEP deve conter 8 dígitos.");
    }
}