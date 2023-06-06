package br.com.microservice.loja.loja.dto;

import lombok.Data;

@Data
public class InfoFornecedor {

    private Long id;
    private String nome;
    private String uf;
    private String endereco;
}
