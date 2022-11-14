package pe.ineapp.ineappmundialservice.Mundial.infrastructure.request;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JugadorRequest {
    private String jugador;
    private String pais;
    private String edad;
}
