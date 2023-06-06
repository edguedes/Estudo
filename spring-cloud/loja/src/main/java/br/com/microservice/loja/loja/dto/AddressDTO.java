package br.com.microservice.loja.loja.dto;

import lombok.Data;

@Data
public class AddressDTO {

    private String street;

    private String number;

    private String uf;
}
