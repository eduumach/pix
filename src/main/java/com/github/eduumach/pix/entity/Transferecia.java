package com.github.eduumach.pix.entity;

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

}
