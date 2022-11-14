package pe.ineapp.ineappmundialservice.Mundial.infrastructure.response;


import lombok.Builder;
import lombok.Data;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Estadio;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Jugador;

import java.util.List;

@Builder
@Data
public class EstadioResponse {
    private List<Estadio> Estadios;
    private BasicResponse basicResponse;
}
