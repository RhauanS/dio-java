package com.rhauan.dadosUsuario;
import java.util.Scanner;

public class ContaTerminal {
    Scanner scanner = new Scanner(System.in);
    
    
    int numero;
    String agencia;
    String nomeCliente;
    double Saldo;


    

    public void salvarAgencia() {
        agencia = scanner.nextLine();
        
    }

    public int salvarNumero() {
        numero = scanner.nextInt();
        scanner.nextLine();
        return numero;  
    }

    public void salvarNomeClinte() {
        nomeCliente = scanner.nextLine();
    }

    public double salvarSaldo() {
        Saldo = scanner.nextDouble();
        scanner.nextLine();
        return Saldo;     
    }


    
}
