package tn.esprit.foyersae9.ServiceI;

import java.util.List;

public interface Chambre {

    public List<tn.esprit.foyersae9.entity.Chambre> getAll();

    public tn.esprit.foyersae9.entity.Chambre add(tn.esprit.foyersae9.entity.Chambre Chambre);
    public void delete(Long idChambre);
    public tn.esprit.foyersae9.entity.Chambre update(tn.esprit.foyersae9.entity.Chambre Chambre);
}
