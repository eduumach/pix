package com.github.eduumach.pix.request;

import com.github.eduumach.pix.model.Conta;

public class PessoaRequest {

    private String name;
    private String cpf;
    private Conta conta;

    public PessoaRequest() {
    }

    public PessoaRequest(String name, String cpf, Conta conta) {
        this.name = name;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
