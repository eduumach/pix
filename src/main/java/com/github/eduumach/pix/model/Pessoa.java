package com.github.eduumach.pix.model;


import javax.persistence.*;

@Entity
@Table(name = "Pessoa")
@SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", allocationSize = 1)
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String name;

    @Column(name = "CPF")
    private String cpf;

    @ManyToOne
    @Column(name = "ID_CONTA")
    private Conta conta;

    public Pessoa() {
    }

    public Pessoa(String name, String cpf, Conta conta) {
        this.name = name;
        this.cpf = cpf;
        this.conta = conta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setCpf(String pdf) {
        this.cpf = pdf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
