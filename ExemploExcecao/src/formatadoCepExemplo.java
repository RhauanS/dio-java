public class formatadoCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        // Formata o CEP: 23765064 -> 23.765-064
        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5, 8);
    }
}