package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.EstoqueDto;
import com.rns.testes.java.model.Estoque;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Interface respons?vel por implementar MapperStruct no mapeamento entre Estoque e EstoqueDto.
 */
@Mapper
public interface EstoqueMapper extends GenericMapper<Estoque, EstoqueDto> {

    EstoqueMapper INSTANCE = Mappers.getMapper(EstoqueMapper.class);

}