package tn.esprit.foyersae9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Reservation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date dateResevation;
    private Boolean estValide;
    @ManyToMany
        private List<Etudiant>res;
    @OneToOne
    private Foyer fo;
}
