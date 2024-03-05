package com.restful.correios.cep.service.impl;

import com.restful.correios.cep.dto.DadosDetalhamentoEndereco;
import com.restful.correios.cep.dto.DadosListagemEndereco;
import com.restful.correios.cep.service.EnderecoService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    private final String url = "https://viacep.com.br/ws/";
    private final String json = "/json/";

    @Override
    public DadosListagemEndereco consultaCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = this.url + cep + this.json;
        return restTemplate.getForObject(url, DadosListagemEndereco.class);
    }

    @Override
    public DadosDetalhamentoEndereco detalhamentoCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = this.url + cep + this.json;
        return restTemplate.getForObject(url, DadosDetalhamentoEndereco.class);
    }
}
