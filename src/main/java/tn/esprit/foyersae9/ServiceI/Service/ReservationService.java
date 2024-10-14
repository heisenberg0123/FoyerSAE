package tn.esprit.foyersae9.ServiceI.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyersae9.Repository.ReservationRepository;
import tn.esprit.foyersae9.entity.Foyer;
import tn.esprit.foyersae9.entity.Reservation;

import java.util.List;
@Service
public class ReservationService {

    private ReservationRepository ReservationRepository;

    public ReservationService(tn.esprit.foyersae9.Repository.ReservationRepository reservationRepository) {
        ReservationRepository = reservationRepository;
    }

    public List<Reservation> getAll(){
        return ReservationRepository.findAll();
    }

    public Reservation add(Reservation Foyer){
        return ReservationRepository.save(Foyer);


    }
    public void delete(Long Reservation){
        ReservationRepository.deleteById(Reservation);


    }
    public Reservation update(Reservation Reservation){
        return ReservationRepository.save(Reservation);
    }

}
