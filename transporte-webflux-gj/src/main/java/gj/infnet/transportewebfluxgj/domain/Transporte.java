package gj.infnet.transportewebfluxgj.domain;

import gj.infnet.transportewebfluxgj.commands.CriarTransporteCommand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Table("transporte")
public class Transporte {
    @Id
    private Long id;
    private Long veiculo;

    private String CEP;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;

    public Transporte (CriarTransporteCommand command) {
        this.veiculo = command.getVeiculoId();
        this.CEP = command.getCEP();
    }

    public Transporte(Long id, Long veiculo, String CEP, String estado, String cidade, String bairro, String logradouro) {
        this.id = id;
        this.veiculo = veiculo;
        this.CEP = CEP;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }
    public Transporte() {

    }

    public Transporte(Long id) {
        this.id = id;
    }
}
