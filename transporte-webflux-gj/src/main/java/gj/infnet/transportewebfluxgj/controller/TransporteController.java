package gj.infnet.transportewebfluxgj.controller;


import gj.infnet.transportewebfluxgj.service.CepWebClient;
import gj.infnet.transportewebfluxgj.service.TransporteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transporte")
@Slf4j
public class TransporteController {

    @Autowired
    TransporteRepository transporteRepository;

    @Autowired
    CepWebClient cepWebClient;

    @GetMapping
    public String transporte() {
        log.info("-----\n 1");
        cepWebClient.obterDadosCep("22290000").subscribe(System.out::println);
        log.info("tt \n 2");
        return "Transporte WebFlux GJ";
    }
}
