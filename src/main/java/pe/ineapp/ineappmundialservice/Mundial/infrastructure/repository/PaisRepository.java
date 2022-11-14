package pe.ineapp.ineappmundialservice.Mundial.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Pais;

public interface PaisRepository extends JpaRepository<Pais,String> {
}
