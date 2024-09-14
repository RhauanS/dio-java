import java.util.InputMismatchException;
import java.util.Scanner;
import com.Hypetech.PerfilConta.UsuarioDados;

public class Usuario {
    public static void main(String[] args) {
        UsuarioDados usuario = new UsuarioDados();
        Scanner scanner = new Scanner(System.in);
    
<<<<<<< HEAD
        // Captura os dados do usuário
=======
        
>>>>>>> teste
        try {
            usuario.SalvarNome();
            usuario.SalvarCpf();
        } catch (InputMismatchException e) {
            System.out.println("Apenas números válidos para o CPF.");
<<<<<<< HEAD
            scanner.nextLine(); // Limpa o buffer
            return; // Finaliza a execução caso tenha erro na entrada
        }

        // Pede o CPF como string e converte para long
=======
            scanner.nextLine(); // Limpeza de buffer
            return; 
        }

        
>>>>>>> teste
        System.out.println("Digite o CPF para validação:");
        String cpfString = scanner.nextLine();
        long cpfLong;
        try {
<<<<<<< HEAD
            cpfLong = Long.parseLong(cpfString); // Converte a string para long
        } catch (NumberFormatException e) {
            System.out.println("CPF inválido. Digite apenas números.");
            return; // Finaliza o programa caso CPF seja inválido
        }
    
        // Validação de nome e CPF
        if (usuario.validarUsuario("Rhauan", cpfLong)) { // Passa o cpfLong para o método
=======
            cpfLong = Long.parseLong(cpfString); 
        } catch (NumberFormatException e) {
            System.out.println("CPF inválido. Digite apenas números.");
            return;             
        }
    
        
        if (usuario.validarUsuario("Maria", cpfLong)) { 
>>>>>>> teste
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
