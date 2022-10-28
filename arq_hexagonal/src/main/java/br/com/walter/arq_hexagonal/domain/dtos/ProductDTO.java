package br.com.walter.arq_hexagonal.domain.dtos;

import lombok.Data;

@Data
public class ProductDTO {

    private String sku;
    private String name;
    private Double price;
    private Double qtd;

    public ProductDTO(String sku, String name, Double price, Double qtd) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }
}
