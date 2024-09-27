package gj.infnet.veiculosk8sgjspring.controller;


import gj.infnet.veiculosk8sgjspring.domain.Veiculo;
import gj.infnet.veiculosk8sgjspring.services.VeiculoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veiculos")
@RequiredArgsConstructor
@Slf4j
public class VeiculoController {
    private final VeiculoService veiculoService;

    @GetMapping
    @Operation(summary = "Lista todos veiculos")
    public List<Veiculo> obterTodos() {
        return veiculoService.listarVeiculos();
    }

    @PostMapping
    @Operation(summary = "Salva um veiculo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    content = {
                            @Content(schema = @Schema(implementation = Veiculo.class))
                    }
            )
    })
    public ResponseEntity<Veiculo> salvar(@RequestBody Veiculo veiculo) {
        log.info("Salvando veiculo");
        try {
            return new ResponseEntity<Veiculo>(veiculoService.salvarVeiculo(veiculo), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/por-id/{id}")
    @Operation(summary = "deleta um veiculo por id")
    public Veiculo deletarUm(@PathVariable Long id) {
        return veiculoService.deletarVeiculo(id);
    }

    @PutMapping
    @Operation(summary = "Modifica um veiculo ")
    public Veiculo atualizar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvarVeiculo(veiculo);
    }

}
