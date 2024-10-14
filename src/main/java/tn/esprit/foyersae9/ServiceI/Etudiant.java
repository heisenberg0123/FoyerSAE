package tn.esprit.foyersae9.ServiceI;

import java.util.List;

public interface Etudiant {
    public List<tn.esprit.foyersae9.entity.Etudiant> getAll();

    public tn.esprit.foyersae9.entity.Etudiant add(tn.esprit.foyersae9.entity.Etudiant Etudiant);
    public void delete(Long idChambre);
    public tn.esprit.foyersae9.entity.Etudiant update(tn.esprit.foyersae9.entity.Etudiant Chambre);

}
