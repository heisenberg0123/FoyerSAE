package tn.esprit.foyersae9.Cntroller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae9.ServiceI.Service.FoyerService;
import tn.esprit.foyersae9.entity.Foyer;

import java.util.List;

@RestController
@RequestMapping
public class FoyerController {

    private FoyerService FoyerDervice;

    public FoyerController(FoyerService foyerDervice) {
        FoyerDervice = foyerDervice;
    }
    @PostMapping(path = "/add")
    public Foyer add(@RequestBody Foyer foyer){
     return    FoyerDervice.add(foyer);
    }

    @GetMapping(path = "/getall")
    List<Foyer> getall(){
        return FoyerDervice.getAll();
    }
    @PutMapping(path = "/update")
    Foyer update(@RequestBody Foyer foyer){
        return FoyerDervice.update(foyer);
    }
    @DeleteMapping(path = "/delete")
    void delete(@RequestBody Long id){
        FoyerDervice.delete(id);
    }

}
