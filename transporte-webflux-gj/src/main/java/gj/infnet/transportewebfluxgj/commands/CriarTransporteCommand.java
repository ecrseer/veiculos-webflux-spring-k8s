package gj.infnet.transportewebfluxgj.commands;

import lombok.Data;

import java.util.Random;

@Data
public class CriarTransporteCommand {

    private Long veiculoId;
    private String CEP;


    public CriarTransporteCommand(Long veiculoId, String CEP) {
        this.veiculoId = veiculoId;
        this.CEP = CEP;
    }
}
