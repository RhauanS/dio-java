package br.com.devflix.Videos;
import java.util.Scanner;

public class Filme {
    Scanner scanner = new Scanner(System.in);
    private String nome;


    public void salvarNomeFilme() {
        this.nome = scanner.nextLine();
    }


    public String getNome() {
        return nome;
    }
    
}
