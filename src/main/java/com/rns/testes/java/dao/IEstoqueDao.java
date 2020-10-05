package com.rns.testes.java.dao;

import com.rns.testes.java.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface representa a camada de persistência da entidade Estoque. Deve ser injetada <b>exclusivamente</b> em uma
 * camada service.
 */
public interface IEstoqueDao extends JpaRepository<Estoque, Long> {
}
