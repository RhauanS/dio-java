
import com.rhauan.dadosUsuario.ContaTerminal;

public class Usuario {
    public static void main(String[] args) {
        ContaTerminal dados = new ContaTerminal();
        

        System.out.print("Por favor, digite o número da conta: ");
        dados.salvarNumero();

        System.out.print("Por favor, digite a Agência: ");
        dados.salvarAgencia();

        System.out.print("Por favor, digite o nome: ");
        dados.salvarNomeCliente();

        System.out.print("Por favor, digite o saldo: ");
        dados.salvarSaldo();

        // Usar os métodos getter para acessar os valores e exibi-los
        System.out.println("Olá " + dados.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + dados.getAgencia() + ", conta " + dados.getNumero() + " e seu saldo " + dados.getSaldo() + " já está disponível para saque.");
    }
}
