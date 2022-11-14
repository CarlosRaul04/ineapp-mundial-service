package pe.ineapp.ineappmundialservice.Mundial.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Jugador")
@Table(
        name = "Jugadores",
        uniqueConstraints = {
                @UniqueConstraint(name = "jugador_jugador_unique", columnNames = "jugador")
        }
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jugador {

    @Id
    String jugador;
    String pais;
    String edad;

}
