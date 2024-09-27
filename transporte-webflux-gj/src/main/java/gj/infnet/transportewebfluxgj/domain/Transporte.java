package gj.infnet.transportewebfluxgj.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Table("transporte")
public class Transporte {
    @Id
    private Long id;
    private Long veiculoId;
    private Date dataInicio;
    private Date dataFim;
    private String responsavelEntrega;

    private String CEP;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;


    private int duracaoHoras;
}
