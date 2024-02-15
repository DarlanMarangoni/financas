package com.darlanmarangoni.financasapi.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_EXTRATO")
public class Extrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "TRANSACAO")
    private String transacao;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "DATA_E_HORA")
    private LocalDateTime dataEHora;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "CATEGORIA")
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

}
