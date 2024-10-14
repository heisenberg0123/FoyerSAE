package tn.esprit.foyersae9.Cntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae9.ServiceI.Service.BlocService;
import tn.esprit.foyersae9.entity.Bloc;

import java.util.List;

@RestController
@RequestMapping
public class BlocController {



private BlocService BlocService;

    public BlocController(tn.esprit.foyersae9.ServiceI.Service.BlocService blocService) {
        BlocService = blocService;
    }

    @PostMapping(path = "/add")
  public Bloc addBloc(@RequestBody Bloc bloc){
      return (bloc) ;

   }
   @GetMapping(path = "/get")
   public List<Bloc> getall(){
        return BlocService.getAll();
   }
@PutMapping(path = "/update")
   public Bloc update(@RequestBody Bloc bloc){
        return BlocService.update(bloc);

   }
@DeleteMapping(path = "/delete")
   public void delete(@RequestBody Long id){
         BlocService.delete(id);
   }

}
