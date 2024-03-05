package com.restful.correios.cep.service;

import com.restful.correios.cep.dto.DadosListagemEndereco;
import com.restful.correios.cep.dto.EnderecoRequest;

public interface EnderecoService {

    DadosListagemEndereco buscaEnderecoPorCep(EnderecoRequest cep);
}
