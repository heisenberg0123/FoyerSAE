package tn.esprit.foyersae9.ServiceI;

import java.util.List;

public interface Foyer {

    public List<tn.esprit.foyersae9.entity.Foyer> getAll();

    public tn.esprit.foyersae9.entity.Foyer add(tn.esprit.foyersae9.entity.Foyer Foyer);
    public void delete(Long Foyer);
    public tn.esprit.foyersae9.entity.Foyer update(tn.esprit.foyersae9.entity.Foyer Foyer);


}
