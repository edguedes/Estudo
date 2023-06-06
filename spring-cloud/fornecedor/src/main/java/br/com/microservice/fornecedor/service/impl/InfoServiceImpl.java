package br.com.microservice.fornecedor.service.impl;

import br.com.microservice.fornecedor.dto.InfoFornecedorDTO;
import br.com.microservice.fornecedor.model.InfoFornecedor;
import br.com.microservice.fornecedor.repository.InfoRepository;
import br.com.microservice.fornecedor.service.InfoService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoRepository infoRepository;

    @Override
    public InfoFornecedor findInfoState(String uf) {
        var result = infoRepository.findByUf(uf);
        return result;
    }

    @Override
    public List<InfoFornecedor> findAll() {
        return infoRepository.findAll();
    }

    @Override
    public InfoFornecedor create(InfoFornecedorDTO fornecedorDTO) {
        return infoRepository.save(fornecedorDTO.mapper());
    }
}
