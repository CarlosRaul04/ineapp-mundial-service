package pe.ineapp.ineappmundialservice.Mundial.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity(name="Estadio")
@Table(
        name = "Estadios",
        uniqueConstraints ={
                @UniqueConstraint(name = "estadio_estadio_unique", columnNames = "estadio")
        }
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Estadio {

    @Id
    String estadio;
    String ciudad;

}
