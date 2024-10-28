package Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class HistoricoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (nullable = false)
    private LocalDateTime data;

    @ManyToOne
    @JoinColumn(name = "id_forma_pagamento")
    private FormaPagamento formaPagamento;

    @Column(precision = 10, scale = 2, nullable = false)
    private double valor;

}
