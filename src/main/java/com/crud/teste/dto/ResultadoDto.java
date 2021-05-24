package com.crud.teste.dto;

import com.crud.teste.entity.Resultado;

import java.util.Objects;

public class ResultadoDto {
    private Long id;
    private String entrada;

    public static ResultadoDto of(Resultado resultado) {
        ResultadoDto resultadoDto = new ResultadoDto();
        resultadoDto.setEntrada(resultado.getEntrada());
        resultadoDto.setId(resultado.getId());
        return resultadoDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultadoDto that = (ResultadoDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
