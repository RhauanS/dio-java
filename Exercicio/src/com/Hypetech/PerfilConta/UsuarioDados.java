package com.Hypetech.PerfilConta;
import java.util.Scanner;

public class UsuarioDados {
    private String nome;
    private long cpf; // Usar long para suportar CPF com até 11 dígitos
    private double saldo = 300.00;
    private Scanner scanner = new Scanner(System.in);

    // Métodos para capturar o nome e o CPF
    public void SalvarNome() {
        System.out.println("Digite seu nome:");
        this.nome = scanner.nextLine();
    }

    public void SalvarCpf() {
        System.out.println("Digite seu CPF:");
        this.cpf = scanner.nextLong();  // CPF agora como long para números grandes
    }

    // Método para validar o nome e o CPF
    public boolean validarUsuario(String nome, long cpf) {
        return this.nome.equals(nome) && this.cpf == cpf; // Comparação de long com ==
    }

    // Método para processar a opção do usuário
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

    // Método getter para saldo
    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }
}
