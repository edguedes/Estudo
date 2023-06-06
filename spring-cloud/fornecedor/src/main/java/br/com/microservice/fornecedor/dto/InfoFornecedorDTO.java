package br.com.microservice.fornecedor.dto;

import br.com.microservice.fornecedor.model.InfoFornecedor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoFornecedorDTO {

    private String nome;
    private String uf;
    private String endereco;

    public InfoFornecedor mapper() {
        return InfoFornecedor.builder()
                .nome(this.getNome())
                .endereco(this.getEndereco())
                .uf(this.getUf()).build();
    }
}
