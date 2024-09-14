package com.Hypebank.PerfilUsuario;
import java.util.Scanner;

public class UsuarioDados {
    private String nome;
    private long cpf; 
    private double saldo = 300.00;
    private Scanner scanner = new Scanner(System.in);

    
    public void SalvarNome() {
        System.out.println("Digite seu nome:");
        this.nome = scanner.nextLine();
    }

    public void SalvarCpf() {
        System.out.println("Digite seu CPF:");
        this.cpf = scanner.nextLong();  
    }

    
    public boolean validarUsuario(String nome, long cpf) {
        return this.nome.equals(nome) && this.cpf == cpf; 
    }

  
    public void processarOpcao(String usuarioOpcao, double valor) {
        if (usuarioOpcao.equalsIgnoreCase("saque")) {
            Sacar(valor);
        } else if (usuarioOpcao.equalsIgnoreCase("deposito")) {
            Depositar(valor);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public double Sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return saldo;
        }
        this.saldo -= valor;
        return this.saldo;
    }

    public double Depositar(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    
    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }
}
