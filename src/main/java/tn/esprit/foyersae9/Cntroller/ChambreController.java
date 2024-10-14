package tn.esprit.foyersae9.Cntroller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae9.ServiceI.Service.ChambreService;
import tn.esprit.foyersae9.entity.Chambre;

import java.util.List;

@RestController
@RequestMapping
public class ChambreController {

    private ChambreService ChambreService;

    public ChambreController(tn.esprit.foyersae9.ServiceI.Service.ChambreService chambreService) {
        ChambreService = chambreService;
    }
    @PostMapping(path = "/add")
    public Chambre add( @RequestBody Chambre Chambre){
        return ChambreService.add(Chambre);
    }
    @GetMapping(path = "getall")
    public List<Chambre> getall(){
        return ChambreService.getAll();
    }
@PostMapping(path = "/pdate")
    public Chambre update(@RequestBody Chambre Chambre){
        return  ChambreService.update(Chambre);
    }

    @DeleteMapping(path = "/delete")
    public void delete(@RequestBody Long Id){
        ChambreService.delete(Id);

    }

}
