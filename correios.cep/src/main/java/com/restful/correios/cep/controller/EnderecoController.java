package com.restful.correios.cep.controller;

import com.restful.correios.cep.dto.DadosDetalhamentoEndereco;
import com.restful.correios.cep.dto.DadosListagemEndereco;
import com.restful.correios.cep.service.impl.EnderecoServiceImpl;
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

    @GetMapping("/cep/{cep}")
    public ResponseEntity<DadosListagemEndereco> consultaCep(@PathVariable("cep") String cep) {
        return ResponseEntity.ok(service.consultaCep(cep));
    }

    @GetMapping("/cep/detalhamento/{cep}")
    public ResponseEntity<DadosDetalhamentoEndereco> detalhamentoCep(@PathVariable("cep") String cep) {
        return ResponseEntity.ok(service.detalhamentoCep(cep));
    }
}
