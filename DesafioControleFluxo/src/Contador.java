import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {

			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			
			System.out.println(e.getMessage());
		}
		
		terminal.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
        if (parametroUm > parametroDois){
			throw new ParametrosInvalidosException();
		}     
        else{
			
			int contagem = parametroDois - parametroUm;		

        	for (int i = parametroUm; i <= parametroDois; i++) {
            	System.out.println(i);
        	}

        	System.out.println("Contagem: " + contagem);
		}
	}
}