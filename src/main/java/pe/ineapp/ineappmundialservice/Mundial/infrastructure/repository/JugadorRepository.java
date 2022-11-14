package pe.ineapp.ineappmundialservice.Mundial.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Jugador;

public interface JugadorRepository extends JpaRepository<Jugador,String> {
}
