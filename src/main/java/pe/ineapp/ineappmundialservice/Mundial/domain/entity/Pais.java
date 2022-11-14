package pe.ineapp.ineappmundialservice.Mundial.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Pais")
@Table(
        name = "Paises",
        uniqueConstraints = {
                @UniqueConstraint(name = "pais_pais_unique", columnNames = "pais")
        }
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pais {

        @Id
        String pais;
        String continente;
        String grupo;

}
