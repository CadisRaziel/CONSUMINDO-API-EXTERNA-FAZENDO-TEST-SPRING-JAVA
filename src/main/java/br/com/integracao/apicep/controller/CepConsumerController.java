package br.com.integracao.apicep.controller;

import br.com.integracao.apicep.model.CepInfo;
import br.com.integracao.apicep.service.CepConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CepConsumerController {
    //segunda forma de consumir api externa

    @Autowired
    private CepConsumerService cepConsumerService;

    @GetMapping("/{cep}")
    public CepInfo apiIntegration(@PathVariable("cep") String cep){
        return cepConsumerService.consume(cep);
    }

}
