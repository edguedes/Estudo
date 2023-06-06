package br.com.microservice.fornecedor.model;

import br.com.microservice.fornecedor.dto.InfoFornecedorDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TB_FORNECEDOR")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InfoFornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String uf;
    private String endereco;

}
