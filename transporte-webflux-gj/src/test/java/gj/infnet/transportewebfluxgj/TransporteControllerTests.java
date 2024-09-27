package gj.infnet.transportewebfluxgj;


import gj.infnet.transportewebfluxgj.controller.TransporteController;
import gj.infnet.transportewebfluxgj.domain.Transporte;
import gj.infnet.transportewebfluxgj.service.CepWebClient;
import gj.infnet.transportewebfluxgj.service.TransporteRepository;
import gj.infnet.transportewebfluxgj.service.ViaCepDTO;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import java.math.BigDecimal;
import reactor.core.publisher.Flux;
import static org.mockito.Mockito.*;
import reactor.core.publisher.Mono;




@WebFluxTest(TransporteController.class)
public class TransporteControllerTests {


    @Autowired
    private WebTestClient client;

    @MockBean
    private TransporteRepository transporteRepository;

    @MockBean
    CepWebClient cepWebClient;

    private Transporte transporte;
    private ViaCepDTO viaCepDTO;

    private final String CEP_BUSCADO = "20050094";

    @BeforeEach
    void setUp() {
        transporte = new Transporte(1L, 42L, CEP_BUSCADO, "RJ", "Rio de Janeiro", "Centro", "Rua Uruguaiana");
        viaCepDTO = new ViaCepDTO(CEP_BUSCADO, "RJ", "Rio de Janeiro", "Centro", "Rua Uruguaiana");
    }

    @Test
    public void testFindAll() {
        doReturn(Flux.just(transporte)).when(transporteRepository).findAll();

        client.get().uri("/transporte/todos")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(Transporte.class)
                .hasSize(1)
                .contains(transporte);

    }


}
