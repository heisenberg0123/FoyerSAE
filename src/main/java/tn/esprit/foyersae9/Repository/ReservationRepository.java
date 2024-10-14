package tn.esprit.foyersae9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyersae9.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
