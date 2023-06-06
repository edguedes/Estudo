package br.com.microservice.fornecedor.service;

import br.com.microservice.fornecedor.dto.InfoFornecedorDTO;
import br.com.microservice.fornecedor.model.InfoFornecedor;

import java.util.List;

public interface InfoService {
    InfoFornecedor findInfoState(String uf);

    List<InfoFornecedor> findAll();

    InfoFornecedor create(InfoFornecedorDTO infoFornecedor);
}
