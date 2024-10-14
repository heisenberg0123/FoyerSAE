package tn.esprit.foyersae9.Cntroller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae9.ServiceI.Service.EtudiantService;
import tn.esprit.foyersae9.entity.Etudiant;

import java.util.List;

@RestController
@RequestMapping
public class EtudiantController {

    private EtudiantService EtudiantService;

    public EtudiantController(tn.esprit.foyersae9.ServiceI.Service.EtudiantService etudiantService) {
        EtudiantService = etudiantService;
    }
    @PostMapping(path="/add")
    public Etudiant add(@RequestBody Etudiant Etudiant){
     return    EtudiantService.add(Etudiant);

    }
@GetMapping(path = "/getall")
    public List<Etudiant>  getall(){
        return EtudiantService.getAll();
    }
    @PutMapping(path = "/update")
    public Etudiant update(@RequestBody Etudiant etudiant){
        return EtudiantService.update(etudiant);
    }
    @DeleteMapping(path = "/delete")

    public void delete(@RequestBody Long id){
        EtudiantService.delete(id);
    }

}
