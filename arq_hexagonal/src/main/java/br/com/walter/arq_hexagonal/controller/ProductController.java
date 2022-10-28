package br.com.walter.arq_hexagonal.controller;

import br.com.walter.arq_hexagonal.domain.doors.interfaces.ProductServiceDoor;
import br.com.walter.arq_hexagonal.domain.dtos.InventoryDTO;
import br.com.walter.arq_hexagonal.domain.dtos.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductServiceDoor productServiceDoor;

    public ProductController(ProductServiceDoor productServiceDoor) {
        this.productServiceDoor = productServiceDoor;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void  createProduct (@RequestBody ProductDTO pruductDTO){

        productServiceDoor.createProduct(pruductDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ProductDTO> getProducts() {
        return productServiceDoor.findProducts();
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    void updateProduct(@RequestParam String sku, @RequestBody InventoryDTO inventoryDTO) {
        productServiceDoor.updateInventory(sku, inventoryDTO);
    }


}
