package com.restful.correios.cep.service;

import com.restful.correios.cep.dto.DadosDetalhamentoEndereco;
import com.restful.correios.cep.dto.DadosListagemEndereco;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnderecoService {

    DadosListagemEndereco consultaCep(String cep);

    DadosDetalhamentoEndereco detalhamentoCep(String cep);
}