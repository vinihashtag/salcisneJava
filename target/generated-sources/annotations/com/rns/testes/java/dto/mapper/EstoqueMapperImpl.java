package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.EstoqueDto;
import com.rns.testes.java.model.Estoque;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-04T13:37:39-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_242-release (JetBrains s.r.o)"
)
public class EstoqueMapperImpl implements EstoqueMapper {

    @Override
    public EstoqueDto entityToDto(Estoque entity) {
        if ( entity == null ) {
            return null;
        }

        EstoqueDto estoqueDto = new EstoqueDto();

        estoqueDto.setQuantidade( (long) entity.getQuantidade() );

        return estoqueDto;
    }

    @Override
    public Estoque dtoToEntity(EstoqueDto dto) {
        if ( dto == null ) {
            return null;
        }

        Estoque estoque = new Estoque();

        if ( dto.getQuantidade() != null ) {
            estoque.setQuantidade( dto.getQuantidade().intValue() );
        }

        return estoque;
    }
}
