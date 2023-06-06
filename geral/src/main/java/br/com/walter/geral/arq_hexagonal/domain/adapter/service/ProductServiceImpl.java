package br.com.walter.arq_hexagonal.domain.adapter.service;

import br.com.walter.arq_hexagonal.domain.doors.Product;
import br.com.walter.arq_hexagonal.domain.doors.interfaces.ProductServiceDoor;
import br.com.walter.arq_hexagonal.domain.doors.repository.ProductRepositoryDoor;
import br.com.walter.arq_hexagonal.domain.dtos.InventoryDTO;
import br.com.walter.arq_hexagonal.domain.dtos.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductServiceDoor {

    private final ProductRepositoryDoor productRepositoryDoor;

    public ProductServiceImpl(ProductRepositoryDoor productRepositoryDoor) {
        this.productRepositoryDoor = productRepositoryDoor;
    }

    @Override
    public List<ProductDTO> findProducts() {
        var listProducts = productRepositoryDoor.findAll();
        var productDTOList = listProducts.stream().map(Product::toProductDTO).collect(Collectors.toList());
        return productDTOList;
    }

    @Override
    public void createProduct(ProductDTO productDTO) {
        Product product = new Product(productDTO);
        productRepositoryDoor.save(product);
    }

    @Override
    public void updateInventory(String sku, InventoryDTO inventoryDTO) {
        Product product = productRepositoryDoor.findBySku(sku);

        if (Objects.isNull(product))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado");

        product.updateInventory(inventoryDTO.getQtd());
        productRepositoryDoor.save(product);

    }
}
