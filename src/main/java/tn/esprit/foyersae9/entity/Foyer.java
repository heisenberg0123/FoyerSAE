package tn.esprit.foyersae9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Foyer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToMany(mappedBy = "f")
    private List<Bloc>b;

    @OneToOne
    private Reservation resr;

}
