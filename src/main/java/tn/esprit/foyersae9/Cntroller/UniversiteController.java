package tn.esprit.foyersae9.Cntroller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae9.ServiceI.Service.UniversiteService1;
import tn.esprit.foyersae9.entity.Universite;

import java.util.List;

@RestController
@RequestMapping
public class UniversiteController {

    private UniversiteService1 un;

    public UniversiteController(@RequestBody UniversiteService1 un) {
        this.un = un;
    }

    @PostMapping(path = "/add")
    public Universite add(@RequestBody Universite une)
    {return un.add(une);
    }
@GetMapping(path = "/getall")
    public List<Universite> getall(){
        return un.getAll();
}
@PutMapping(path = "/update")
    public Universite update(@RequestBody Universite une){
        return un.update(une);

}
@DeleteMapping(path = "/delete")

    void delete(@RequestBody Long id){
        un.delete(id);
}
}
