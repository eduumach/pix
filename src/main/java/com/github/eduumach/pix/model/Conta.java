package com.github.eduumach.pix.model;

import org.javamoney.moneta.Money;

import javax.persistence.*;

@Entity
@Table(name = "Conta")
@SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", allocationSize = 1)
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @Column(name = "ID")
    private Long id;

    @Column(name = "CONTA")
    private String conta;

    @Column(name = "AGENCIA")
    private String agencia;

    @Column(name = "SALDO")
    private Money saldo;

    public Conta() {
    }

    public Conta(String conta, String agencia, Money saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Money getSaldo() {
        return saldo;
    }

    public void setSaldo(Money saldo) {
        this.saldo = saldo;
    }
}
