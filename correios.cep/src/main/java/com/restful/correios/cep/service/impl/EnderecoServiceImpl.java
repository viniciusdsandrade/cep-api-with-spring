package com.restful.correios.cep.service.impl;

import com.restful.correios.cep.dto.DadosListagemEndereco;
import com.restful.correios.cep.dto.EnderecoRequest;
import com.restful.correios.cep.service.EnderecoFeign;
import com.restful.correios.cep.service.EnderecoService;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    private final EnderecoFeign enderecoFeign;

    public EnderecoServiceImpl(EnderecoFeign enderecoFeign) {
        this.enderecoFeign = enderecoFeign;
    }

    @Override
    public DadosListagemEndereco buscaEnderecoPorCep(EnderecoRequest endereco) {
        return enderecoFeign.buscaEnderecoPorCep(endereco.cep());
    }



}
