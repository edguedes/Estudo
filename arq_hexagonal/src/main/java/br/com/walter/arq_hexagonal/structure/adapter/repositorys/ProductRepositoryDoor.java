package br.com.walter.arq_hexagonal.structure.adapter.repositorys;

import br.com.walter.arq_hexagonal.domain.doors.Product;
import br.com.walter.arq_hexagonal.structure.adapter.entity.ProductEntity;
import org.springframework.stereotype.Component;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class ProductRepositoryDoor implements br.com.walter.arq_hexagonal.domain.doors.repository.ProductRepositoryDoor {

    private final SpringProductRepository springProductRepository;

    public ProductRepositoryDoor(SpringProductRepository springProductRepository) {
        this.springProductRepository = springProductRepository;
    }

    @Override
    public List<Product> findAll() {
        var productEntityList = springProductRepository.findAll();
        return productEntityList.stream().map(ProductEntity::toProduct).collect(Collectors.toList());
    }

    @Override
    public Product findBySku(String sku) {
        var productEntity = springProductRepository.findBySku(sku);

        if (productEntity.isPresent())
            return productEntity.get().toProduct();

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto inexistente");

    }

    @Override
    public void save(Product product) {
        ProductEntity productEntity;
        Random aleatorio = new Random();

        if (Objects.isNull(product.getId())){
            productEntity = new ProductEntity(product);
            Long index = aleatorio.nextLong() + aleatorio.nextInt(50) + 1;
            productEntity.setId(index);
        }else {
            productEntity = springProductRepository.findById(product.getId()).get();
            productEntity.update(product);
        }

        springProductRepository.save(productEntity);
    }
}
