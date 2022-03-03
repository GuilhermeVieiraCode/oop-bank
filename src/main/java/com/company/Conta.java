package com.company;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta{
    protected static String AGENCIA_PADRAO = "0001";
    private static int SEQUENCIAL = 1;

    protected String agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirAtributos() {
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println(String.format("Número: %d",this.getNumero()));
        System.out.println(String.format("Saldo: %.2f",this.getSaldo()));
    }
}
