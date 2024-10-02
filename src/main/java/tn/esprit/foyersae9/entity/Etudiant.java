package tn.esprit.foyersae9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data

public class Etudiant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;
    @ManyToMany(mappedBy = "res")
    private List<Reservation>reservations;
}
