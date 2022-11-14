package pe.ineapp.ineappmundialservice.Mundial.infrastructure.response;

import lombok.Builder;
import lombok.Data;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Jugador;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Pais;

import java.util.List;

@Builder
@Data
public class PaisResponse {
    private List<Pais> Paises;
    private BasicResponse basicResponse;
}
