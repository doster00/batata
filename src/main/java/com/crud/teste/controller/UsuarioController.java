package com.crud.teste.controller;

import com.crud.teste.dto.UsuarioDto;
import com.crud.teste.entity.Usuario;
import com.crud.teste.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    protected @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDto> salvar(@RequestBody UsuarioDto usuarioDto) {
        UsuarioDto usuarioSalvo = usuarioService.salvar(usuarioDto);
        return ResponseEntity.ok(usuarioSalvo);
    }

}
