package gj.infnet.transportewebfluxgj.controller;


import gj.infnet.transportewebfluxgj.commands.CriarTransporteCommand;
import gj.infnet.transportewebfluxgj.domain.Transporte;
import gj.infnet.transportewebfluxgj.service.CepDTO;
import gj.infnet.transportewebfluxgj.service.CepWebClient;
import gj.infnet.transportewebfluxgj.service.TransporteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transporte")
@Slf4j
public class TransporteController {

    @Autowired
    TransporteRepository transporteRepository;

    @Autowired
    CepWebClient cepWebClient;

    @PostMapping
    public Mono<Transporte> salvar(@RequestBody CriarTransporteCommand dto) {

        Transporte transportando = new Transporte(dto);

        return cepWebClient.obterDadosCep(transportando.getCEP())
                .flatMap(dadosCep -> {
                    transportando.setLogradouro(dadosCep.getLogradouro());
                    transportando.setBairro(dadosCep.getBairro());
                    transportando.setCidade(dadosCep.getLocalidade());
                    transportando.setEstado(dadosCep.getUf());

                    return transporteRepository.save(transportando);
                })
                .doOnError(e -> log.error("Erro ao salvar transporte", e));

    }

    @GetMapping("/todos")
    public Flux<Transporte> listaTudo() {
        return transporteRepository.findAll();
    }

    @GetMapping("/cep/{cepRequisitado}")
    public Mono<CepDTO> buscaTemperaturaSaoPaulo(@PathVariable String cepRequisitado) {
        return cepWebClient.obterDadosCep(cepRequisitado);
    }


}
