package com.crud.teste.service;

import com.crud.teste.dto.ResultadoDto;
import com.crud.teste.entity.Resultado;
import com.crud.teste.entity.Usuario;
import com.crud.teste.repository.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoService {

    protected  @Autowired
    ResultadoRepository resultadoRepository;

    public ResultadoDto salvar(ResultadoDto resultadoDto, Usuario usuario) {
        Resultado resultado = resultadoRepository.save(Resultado.of(resultadoDto, usuario));
        return ResultadoDto.of(resultado);
    }

}
