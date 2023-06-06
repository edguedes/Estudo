package br.com.microservice.loja.loja.dto;

import lombok.Data;

import java.util.List;

@Data
public class ShoppingDTO {

    private List<ItemShoppingDTO> itens;

    private AddressDTO address;

}
