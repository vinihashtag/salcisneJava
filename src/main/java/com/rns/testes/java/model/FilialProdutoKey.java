package com.rns.testes.java.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
//@Data
class FilialProdutoKey implements Serializable {

    @Column(name = "filial_id")
    Long filialId;

    @Column(name = "produto_id")
    String produtoId;

}