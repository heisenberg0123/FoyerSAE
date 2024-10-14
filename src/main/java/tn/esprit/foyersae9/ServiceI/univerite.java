package tn.esprit.foyersae9.ServiceI;

import tn.esprit.foyersae9.entity.Universite;

import java.util.List;

public interface univerite {

    public List<Universite> getAll();

    public Universite add(Universite Foyer);
    public void delete(Long Universite);
    public Universite update(Universite Universite);
}
