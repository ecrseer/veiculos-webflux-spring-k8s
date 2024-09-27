package gj.infnet.veiculosk8sgjspring.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comentarios")
@RequiredArgsConstructor
@Slf4j
public class VeiculoController {


    @GetMapping
    @Operation
    public String tes() {
        log.info("Listando comentarios");
        return "Bomdia";
    }

}
