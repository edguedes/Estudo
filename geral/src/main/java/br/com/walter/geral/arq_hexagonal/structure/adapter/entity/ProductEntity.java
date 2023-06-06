package br.com.walter.arq_hexagonal.structure.adapter.entity;


import br.com.walter.arq_hexagonal.domain.doors.Product;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {

    @Id
    private Long id;
    private String sku;
    private String name;
    private Double price;
    private Double qtd;

    public ProductEntity() {
    }

    public ProductEntity(Product product) {
        this.sku = product.getSku();
        this.name = product.getName();
        this.price = product.getPrice();
        this.qtd = product.getQtd();
    }

    public void update(Product product) {
        this.sku = product.getSku();
        this.name = product.getName();
        this.price = product.getPrice();
        this.qtd = product.getQtd();
    }

    public Product toProduct() {
        return new Product(this.id, this.sku, this.name, this.price, this.qtd);
    }
}
