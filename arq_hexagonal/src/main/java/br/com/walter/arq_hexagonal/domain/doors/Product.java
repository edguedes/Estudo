package br.com.walter.arq_hexagonal.domain.doors;

import br.com.walter.arq_hexagonal.domain.dtos.ProductDTO;
import lombok.Data;

import java.util.UUID;

@Data
public class Product {

    private Long id;
    private String sku;
    private String name;
    private Double price;
    private Double qtd;

    public Product() { }

    public Product(ProductDTO productDTO) {
        this.sku = productDTO.getSku();
        this.name = productDTO.getName();
        this.price = productDTO.getPrice();
        this.qtd = productDTO.getQtd();
    }

    public Product(Long id, String sku, String name, Double price, Double qtd) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }

    public void updateInventory(Double qtd) { this.qtd = qtd; }

    public ProductDTO toProductDTO() {
        return new ProductDTO(this.sku, this.name, this.price, this.qtd);
    }
}
