package com.crud.teste.entity;

import com.crud.teste.dto.ResultadoDto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_resultado")
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String entrada;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    public static Resultado of(ResultadoDto resultadoDto, Usuario usuario) {
        Resultado resultado = new Resultado();
        resultado.setEntrada(resultadoDto.getEntrada());
        resultado.setUsuario(usuario);
        return resultado;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resultado resultado = (Resultado) o;
        return Objects.equals(id, resultado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
