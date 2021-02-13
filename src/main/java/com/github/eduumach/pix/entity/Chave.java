package com.github.eduumach.pix.entity;

import javax.persistence.*;

@Entity
@Table(name = "Chave")
public class Chave {

    @Id
    @Column(name = "ID")
    private String chave;

    @ManyToOne
    @Column(name = "ID_PESSOA")
    private Pessoa pessoa;

    public Chave() {
    }

    public Chave(String chave, Pessoa pessoa) {
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
