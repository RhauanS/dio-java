import java.util.InputMismatchException;
import java.util.Scanner;
import com.Hypetech.PerfilConta.UsuarioDados;

public class Usuario {
    public static void main(String[] args) {
        UsuarioDados usuario = new UsuarioDados();
        Scanner scanner = new Scanner(System.in);
    
        
        try {
            usuario.SalvarNome();
            usuario.SalvarCpf();
        } catch (InputMismatchException e) {
            System.out.println("Apenas números válidos para o CPF.");
            scanner.nextLine(); // Limpeza de buffer
            return; 
        }

        
        System.out.println("Digite o CPF para validação:");
        String cpfString = scanner.nextLine();
        long cpfLong;
        try {
            cpfLong = Long.parseLong(cpfString); 
        } catch (NumberFormatException e) {
            System.out.println("CPF inválido. Digite apenas números.");
            return;             
        }
    
        
        if (usuario.validarUsuario("Maria", cpfLong)) { 
            System.out.println("Escolha uma opção (saque/deposito):");
            String opcao = scanner.nextLine();
    
            System.out.println("Informe o valor:");
            double valor = scanner.nextDouble();
    
            // Processa a opção do usuário
            usuario.processarOpcao(opcao, valor);
            System.out.println("Saldo atual: " + usuario.getSaldo());
        } else {
            System.out.println("Nome ou CPF inválido.");
        }

        scanner.close();
         
    }
    
}
