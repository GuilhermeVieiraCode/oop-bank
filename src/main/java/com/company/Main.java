package com.company;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Bank");

        Cliente john = new Cliente("John Doe");
        Cliente jane = new Cliente("Jane Doe");

        Conta corrente = new ContaCorrente(john);
        Conta poupanca = new ContaPoupanca(jane);

        banco.adicionarConta(corrente);
        banco.adicionarConta(poupanca);
        banco.getClientes();

        corrente.depositar(100);
        poupanca.depositar(50);
        corrente.transferir(25, poupanca);

        corrente.extrato();
        poupanca.extrato();
    }
}
