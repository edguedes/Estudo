package br.com.walter.arq_hexagonal.structure.configuration;

import br.com.walter.arq_hexagonal.domain.adapter.service.ProductServiceImpl;
import br.com.walter.arq_hexagonal.domain.doors.interfaces.ProductServiceDoor;
import br.com.walter.arq_hexagonal.domain.doors.repository.ProductRepositoryDoor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    ProductServiceDoor productService(ProductRepositoryDoor productRepositoryDoor) {
        return new ProductServiceImpl(productRepositoryDoor);
    }
}
