package tn.esprit.foyersae9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre ;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @OneToMany
    private List<Reservation>l;
    @ManyToOne
    private Bloc bl;


}
