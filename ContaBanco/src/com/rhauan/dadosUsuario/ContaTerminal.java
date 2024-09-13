package com.rhauan.dadosUsuario;
import java.util.Scanner;



public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    
    Scanner scanner = new Scanner(System.in);   

   
    public void salvarNumero() {
        this.numero = scanner.nextInt();
        scanner.nextLine();  // Limpa o buffer do scanner
    }

    public void salvarAgencia() {
        this.agencia = scanner.nextLine();
    }

    public void salvarNomeCliente() {
        this.nomeCliente = scanner.nextLine();
    }

    public void salvarSaldo() {
        this.saldo = scanner.nextDouble();
        scanner.nextLine();  // Limpa o buffer do scanner
    }

    // Métodos getter para acessar os valores fora da classe
    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
