package gj.infnet.transportewebfluxgj.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class CepWebClient {
    private final WebClient webClient;

    public CepWebClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://viacep.com.br/ws/").build();
    }

    public Mono<CepDTO> obterDadosCep(String cep) {
        Mono<CepDTO> endereco = webClient
                .get()
                .uri(cep + "/json/")
                .retrieve()
                .bodyToFlux(CepDTO.class).next();
        return endereco;
    }

}
