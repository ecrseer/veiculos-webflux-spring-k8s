package gj.infnet.veiculosgjeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class VeiculosGjEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VeiculosGjEurekaServerApplication.class, args);
    }

}
