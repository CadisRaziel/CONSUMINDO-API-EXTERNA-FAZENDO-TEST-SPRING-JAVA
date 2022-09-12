package br.com.integracao.apicep.service;

import br.com.integracao.apicep.model.CepInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CepConsumerServiceTest {
    @Autowired
    private CepConsumerService service;

    @Test
    public void consumerTest(){
       CepInfo cepInfo = service.consume("15060035");
        Assertions.assertNotNull(cepInfo);
        Assertions.assertEquals("São José do Rio Preto", cepInfo.getCidade());
        Assertions.assertEquals("SP", cepInfo.getEstado());
        //System.out.println(cepInfo);
    }

}
