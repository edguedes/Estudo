package br.com.microservice.fornecedor.repository;

import br.com.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {

    InfoFornecedor findByUf(String uf);
}
