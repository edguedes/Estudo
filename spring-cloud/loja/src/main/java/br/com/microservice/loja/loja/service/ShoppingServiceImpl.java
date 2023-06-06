package br.com.microservice.loja.loja.service;

import br.com.microservice.loja.loja.dto.InfoFornecedor;
import br.com.microservice.loja.loja.dto.ShoppingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShoppingServiceImpl implements ShoppingService{

    @Autowired
    private RestTemplate client;

    /*Parametro para buscar na API Fornecedor*/
    @Override
    public void executeShopping(ShoppingDTO shopping) {

        ResponseEntity<InfoFornecedor> exchange = client.exchange("http://fornecedor/info/"+ shopping.getAddress().getUf(),
                HttpMethod.GET, null, InfoFornecedor.class);

        System.out.println(exchange.getBody());
    }
}
