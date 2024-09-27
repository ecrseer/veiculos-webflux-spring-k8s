package gj.infnet.veiculosk8sgjspring.services;

import gj.infnet.veiculosk8sgjspring.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Veiculo buscarVeiculo(Long id) {
        return veiculoRepository.findById(id).orElse(null);
    }

    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }

    public Veiculo deletarVeiculo(Long id) {
        Veiculo paraDeletar = buscarVeiculo(id);
        veiculoRepository.deleteById(id);
        return paraDeletar;
    }


}
