package com.crud.teste.service;

import com.crud.teste.dto.ResultadoDto;
import com.crud.teste.dto.UsuarioDto;
import com.crud.teste.entity.Usuario;
import com.crud.teste.repository.ResultadoRepository;
import com.crud.teste.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    protected @Autowired
    UsuarioRepository usuarioRepository;

    protected @Autowired
    ResultadoService resultadoService;

    public UsuarioDto salvar(UsuarioDto usuarioDto) {
        Usuario usuario = usuarioRepository.save(Usuario.of(usuarioDto));
        List<ResultadoDto> resultadosDto = new ArrayList<>();

        if (usuarioDto.getResultados() != null && !usuarioDto.getResultados().isEmpty()) {
            resultadosDto = usuarioDto.getResultados().stream().
                    map(resultadoDto -> resultadoService.salvar(resultadoDto, usuario)).
                    collect(Collectors.toList());
        }

        return UsuarioDto.of(usuario, resultadosDto);
    }
}
