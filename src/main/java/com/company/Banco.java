package com.company;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public void getClientes(){
        System.out.println("=== Clientes ====");
        for(Conta conta : contas){
            System.out.println(conta.getCliente().getNome());
        }
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }
}
