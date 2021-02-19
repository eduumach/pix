package com.github.eduumach.pix.request;

import org.javamoney.moneta.Money;

public class ContaRequest {

    private String conta;
    private String agencia;
    private Money saldo;

    public ContaRequest() {
    }

    public ContaRequest(String conta, String agencia, Money saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
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
