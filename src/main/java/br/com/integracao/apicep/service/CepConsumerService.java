package br.com.integracao.apicep.service;

import br.com.integracao.apicep.model.CepInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepConsumerService {
    //@Value -> para pegar um valor de uma configuração tanto do maven quando do grandle (no caso aqui no properties.yml)
    @Value("${url.api.cep}")
    private String url;

    public CepInfo consume(String cep) {
        String finalUrl = url + cep;

        //RestTemplate -> retorna algo atraves de uma url
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(finalUrl, CepInfo.class);
    }
}
