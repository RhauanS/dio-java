import java.util.Scanner;
import java.util.Locale;


public class Usuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ContaTerminal dados = new ContaTerminal();

        System.out.print("Por favor, digite o número da conta: ");
        dados.salvarNumero();

        System.out.print("Por favor, digite da Agência: ");
        dados.salvarAgencia();

        System.out.print("Por favor, digite o nome: ");
        dados.salvarNomeClinte();

        System.out.print("Por favor, digite saldo: ");
        dados.salvarSaldo();

       System.out.println("Olá "+ dados.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ dados.agencia + ", conta "+ dados.numero + " e seu saldo " + dados.Saldo + " já está disponível para saque");
       
       scanner.close();
    }
}
