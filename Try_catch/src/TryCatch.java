import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in); 
            Locale.setDefault(Locale.US);           

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble(); 


            System.out.println("Seja bem vindo " + nome + sobrenome);

            System.out.println("Idade de " + idade + " e altura de " + altura);
            
            scanner.close();
        }
            catch(InputMismatchException e) {
                System.err.println("O campo idade e altura precisam ser numericos!");
            }   
    }
    
}
