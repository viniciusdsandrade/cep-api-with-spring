package com.restful.correios.cep.dto;

public record DadosListagemEndereco(
        String cep,
        String logradouro,
        String bairro,
        String localidade,
        String uf,
        String ddd
) {
}
