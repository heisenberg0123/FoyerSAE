package tn.esprit.foyersae9.ServiceI;

import tn.esprit.foyersae9.entity.Reservation;

import java.util.List;

public interface reservation {

    public List<Reservation> getAll();

    public Reservation add(Reservation Foyer);
    public void delete(Long Reservation);
    public Reservation update(Reservation Reservation);


}
