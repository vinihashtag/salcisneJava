package com.rns.testes.java.seeder;

import com.rns.testes.java.model.Estoque;
import com.rns.testes.java.model.Filial;
import com.rns.testes.java.model.Produto;
import com.rns.testes.java.service.IEstoqueService;
import com.rns.testes.java.service.IFilialService;
import com.rns.testes.java.service.IProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class StockSeeder {

    @Autowired
    IEstoqueService service;
    @Autowired
    IProdutoService serviceProduto;
    @Autowired
    IFilialService serviceFilial;

    @EventListener
    public void seedFilial(ContextRefreshedEvent event) {
        try {
            log.info("Criando estoque....");
            criandoEstoque();
        } catch (Exception e) {
            log.error(e.getMessage());
        }

    }

    private void criandoEstoque() {

        List<Filial> listaFiliais = serviceFilial.findAll();
        List<Produto> listaProdutos = serviceProduto.findAll();

        int count = 10;
        for(Filial filial : listaFiliais){
            for(Produto produto: listaProdutos){
//
                Estoque estoque = new Estoque();
                estoque.setQuantidade(count);
                estoque.setFilial(filial);
                estoque.setProduto(produto);

                service.save(estoque);
                count+=10;
            }
        }

    }
}
