package com.github.eduumach.pix.entity;

import javax.persistence.*;

@Entity
@Table(name = "Chave")
public class Chave {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @Column(name = "ID")
    private Long id;

    @Column(name = "CHAVE")
    private String chave;

    @ManyToOne
    private Pessoa pessoa;

    public Chave() {
    }

    public Chave(String chave, Pessoa pessoa) {
        this.chave = chave;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
