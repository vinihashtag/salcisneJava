package com.rns.testes.java.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PRODUTO")
@Data
public class Produto extends GenericEntity<String>{

    @Id
    private String id;

    @Column
    private String nome;

    @Override
    public String getId() {
        return id;
    }
}
