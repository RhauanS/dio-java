package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
        String[] candidatos = {
            "João", "Maria", "Pedro", "Ana", "Lucas",
        };

        for(String candidato : candidatos) {
                  
        }


    }

    static void imprimirSelecionados(){
        String[] candidatos = {
            "João", "Maria", "Pedro", "Ana", "Lucas",
        };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length;indice++) {
            System.out.println("O candidado de nº " + (indice+1) + " é " + candidatos[indice]);
            
        } 

        System.out.println("Forma abrevida de interação for each");
        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " +  candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
            "João", "Maria", "Pedro", "Ana", "Lucas", "Clara", "Gabriel", "Larissa", 
            "Felipe", "Juliana", "Rafael", "Amanda", "Mateus", "Beatriz", "Caio", 
            "Carolina", "Vinícius", "Fernanda", "Diego", "Bianca"
        };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

        if (candidatosSelecionados < 5) {
            System.out.println("Nem todos os candidatos foram selecionados.");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
