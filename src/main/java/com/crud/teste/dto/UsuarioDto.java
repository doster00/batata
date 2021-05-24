package com.crud.teste.dto;

import com.crud.teste.entity.Resultado;
import com.crud.teste.entity.Usuario;

import java.util.List;
import java.util.Objects;

public class UsuarioDto {
    private Long id;
    private String nome;
    private String email;
    private List<ResultadoDto> resultados;

    public static UsuarioDto of(Usuario usuario, List<ResultadoDto> resultadosDto) {
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId(usuario.getId());
        usuarioDto.setNome(usuario.getNome());
        usuarioDto.setEmail(usuario.getEmail());
        usuarioDto.setResultados(resultadosDto);
        return usuarioDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ResultadoDto> getResultados() {
        return resultados;
    }

    public void setResultados(List<ResultadoDto> resultados) {
        this.resultados = resultados;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioDto that = (UsuarioDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
