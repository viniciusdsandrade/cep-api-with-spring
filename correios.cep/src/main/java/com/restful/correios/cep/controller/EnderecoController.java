package com.restful.correios.cep.controller;

import com.restful.correios.cep.dto.DadosListagemEndereco;
import com.restful.correios.cep.dto.EnderecoRequest;
import com.restful.correios.cep.service.impl.EnderecoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/endereco")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EnderecoController {

    private final EnderecoServiceImpl service;

    public EnderecoController(EnderecoServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/cep")
    public ResponseEntity<DadosListagemEndereco> consultaCep(@RequestBody @Valid EnderecoRequest enderecoRequest) {
        return ResponseEntity.ok(service.buscaEnderecoPorCep(enderecoRequest));
    }
}
