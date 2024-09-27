package gj.infnet.transportewebfluxgj.service;

import gj.infnet.transportewebfluxgj.domain.Transporte;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface TransporteRepository extends R2dbcRepository<Transporte, Long> {

}
