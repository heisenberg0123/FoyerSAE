package tn.esprit.foyersae9.ServiceI.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyersae9.Repository.FoyerRepository;
import tn.esprit.foyersae9.entity.Etudiant;
import tn.esprit.foyersae9.entity.Foyer;

import java.util.List;
@Service
public class FoyerService {

    private FoyerRepository FoyerRepository;

    public FoyerService(tn.esprit.foyersae9.Repository.FoyerRepository foyerRepository) {
        FoyerRepository = foyerRepository;
    }

    public List<Foyer> getAll(){
        return FoyerRepository.findAll();
    };

    public Foyer add(Foyer Foyer){
        return FoyerRepository.save(Foyer);


    }
    public void delete(Long id){
        FoyerRepository.deleteById(id);


    }
    public Foyer update(Foyer Foyer){
        return FoyerRepository.save(Foyer);
    }

}
