package com.github.eduumach.pix.request;

import com.github.eduumach.pix.model.Chave;
import org.javamoney.moneta.Money;

public class TransferenciaRequest {

    private Chave crChave;
    private Chave cdChave;
    private Money quantidade;

    public TransferenciaRequest() {
    }

    public TransferenciaRequest(Chave crChave, Chave cdChave, Money quantidade) {
        this.crChave = crChave;
        this.cdChave = cdChave;
        this.quantidade = quantidade;
    }

    public Chave getCrChave() {
        return crChave;
    }

    public void setCrChave(Chave crChave) {
        this.crChave = crChave;
    }

    public Chave getCdChave() {
        return cdChave;
    }

    public void setCdChave(Chave cdChave) {
        this.cdChave = cdChave;
    }

    public Money getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Money quantidade) {
        this.quantidade = quantidade;
    }
}
