package gj.infnet.transportewebfluxgj.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class HealthController {

    @GetMapping
    public String health() {
        return "O serviço está ativo";
    }
}
