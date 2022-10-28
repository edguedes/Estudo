package br.com.walter.arq_hexagonal.domain.doors.repository;

import br.com.walter.arq_hexagonal.domain.doors.Product;

import java.util.List;

public interface ProductRepositoryDoor {

    List<Product> findAll();

    Product findBySku(String sku);

    void save(Product product);
}
