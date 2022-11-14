package pe.ineapp.ineappmundialservice.Mundial.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Estadio;

public interface EstadioRepository extends JpaRepository<Estadio,String> {
}
