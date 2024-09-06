public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicidtado = 17.0;

        if (valorSolicidtado < saldo) {
            saldo = saldo - valorSolicidtado;
            
        }
        System.out.println(saldo);
    }
}
