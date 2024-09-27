package gj.infnet.veiculosk8sgjspring.services;

import gj.infnet.veiculosk8sgjspring.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
