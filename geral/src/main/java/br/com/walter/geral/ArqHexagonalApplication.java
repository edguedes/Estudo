package br.com.walter.arq_hexagonal;

import br.com.walter.arq_hexagonal.structure.adapter.repositorys.SpringProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackageClasses = SpringProductRepository.class)
public class ArqHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArqHexagonalApplication.class, args);
	}

}
