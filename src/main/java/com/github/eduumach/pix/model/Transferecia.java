package com.github.eduumach.pix.model;

import org.javamoney.moneta.Money;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Transferencia")
public class Transferecia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @Column(name = "CR_CHAVE")
    private Chave crChave;

    @ManyToOne
    @Column(name = "CD_CHAVE")
    private Chave cdChave;

    @Column(name = "QUANTIDADE")
    private Money quantidade;

    @Column(name ="HORA_E_DATA")
    private Date horaeData;

    public Transferecia() {
    }

    public Transferecia(Chave crChave, Chave cdChave, Money quantidade, Date horaeData) {
        this.crChave = crChave;
        this.cdChave = cdChave;
        this.quantidade = quantidade;
        this.horaeData = horaeData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getHoraeData() {
        return horaeData;
    }

    public void setHoraeData(Date horaeData) {
        this.horaeData = horaeData;
    }
}
