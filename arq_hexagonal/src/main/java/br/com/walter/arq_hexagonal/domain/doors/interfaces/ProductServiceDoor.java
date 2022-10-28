package br.com.walter.arq_hexagonal.domain.doors.interfaces;

import br.com.walter.arq_hexagonal.domain.dtos.InventoryDTO;
import br.com.walter.arq_hexagonal.domain.dtos.ProductDTO;

import java.util.List;

public interface ProductServiceDoor {

    List<ProductDTO> findProducts();

    void createProduct(ProductDTO productDTO);

    void updateInventory(String sku, InventoryDTO inventoryDTO);
}
