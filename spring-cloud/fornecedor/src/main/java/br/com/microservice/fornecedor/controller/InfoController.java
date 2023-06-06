package br.com.microservice.fornecedor.controller;

import br.com.microservice.fornecedor.dto.InfoFornecedorDTO;
import br.com.microservice.fornecedor.model.InfoFornecedor;
import br.com.microservice.fornecedor.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class InfoController {

    private final InfoService infoService;

    @RequestMapping("/{uf}")
    @GetMapping
    public ResponseEntity<InfoFornecedor> findInfoByState(@PathVariable String uf) {
        InfoFornecedor result = infoService.findInfoState(uf);
        return ResponseEntity.ok().body(result);
    }

    @RequestMapping("/findAll")
    @GetMapping
    public ResponseEntity<List<InfoFornecedor>> findInfoByState() {
        return ResponseEntity.ok().body(infoService.findAll());
    }

    @PostMapping
    public ResponseEntity<InfoFornecedor> create(@RequestBody InfoFornecedorDTO fornecedorDTO) {
        return ResponseEntity.ok().body(infoService.create(fornecedorDTO));
    }
}
