package pe.ineapp.ineappmundialservice.Mundial.infrastructure.response;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.NotFound;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Estadio;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Jugador;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Pais;
import pe.ineapp.ineappmundialservice.Mundial.infrastructure.repository.PaisRepository;

import java.util.List;

@Builder
@Data
public class MundialResponse {
    private List<Pais> Paises;
    private List<Jugador> Jugadores;
    private List<Estadio> Estadios;
    private BasicResponse basicResponse;
}
