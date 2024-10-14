package tn.esprit.foyersae9.Cntroller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae9.ServiceI.Service.ReservationService;
import tn.esprit.foyersae9.entity.Reservation;

import java.util.List;

@RestController
@RequestMapping
public class ReservationController {

    private ReservationService rs;

    public ReservationController(ReservationService rs) {
        this.rs = rs;
    }
@PostMapping(path = "/add")
    public Reservation add(Reservation re){
        return rs.add(re);

}

@GetMapping(path = "/getall")
    public List<Reservation> getall(){
        return rs.getAll();
}
@PutMapping(path = "/update")
    public Reservation update(@RequestBody Reservation re){
        return rs.update(re);
}

}
