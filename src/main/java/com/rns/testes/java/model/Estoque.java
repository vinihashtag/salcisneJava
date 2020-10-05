package com.rns.testes.java.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "ESTOQUE")
@SequenceGenerator(name = "ESTOQUE_SEQ", sequenceName = "ESTOQUE_SEQ", allocationSize = 1)
@Data
public class Estoque extends GenericEntity<Long> {
    @Id
    @GeneratedValue(generator = "ESTOQUE_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "filial_id",  nullable = false)
    private Filial filial;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "produto_id",  nullable = false)
    private Produto produto;

    @NotNull
    private int quantidade;

    @Override
    public Long getId() {
        return id;
    }
}


