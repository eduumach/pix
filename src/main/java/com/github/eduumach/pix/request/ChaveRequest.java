package com.github.eduumach.pix.request;

import com.github.eduumach.pix.model.Pessoa;

public class ChaveRequest {

    private String chave;
    private Pessoa pessoa;

    public ChaveRequest() {
    }

    public ChaveRequest(String chave, Pessoa pessoa) {
        this.chave = chave;
        this.pessoa = pessoa;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
