package com.restful.correios.cep.service;

import com.restful.correios.cep.dto.DadosListagemEndereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "endereco")
public interface EnderecoFeign {

    @GetMapping("{cep}/json")
    DadosListagemEndereco buscaEnderecoPorCep(@PathVariable("cep") String cep);
}
