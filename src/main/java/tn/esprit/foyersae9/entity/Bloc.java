package tn.esprit.foyersae9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Bloc {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    private Foyer f;
    @OneToMany(mappedBy = "bl")
    private List<Chambre>ca;
}
