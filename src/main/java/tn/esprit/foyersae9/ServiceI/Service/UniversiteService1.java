package tn.esprit.foyersae9.ServiceI.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyersae9.Repository.UniversiteRepository;
import tn.esprit.foyersae9.entity.Universite;

import java.util.List;
@Service
public class UniversiteService1 {
    private tn.esprit.foyersae9.Repository.UniversiteRepository UniversiteRepository;

    public UniversiteService1(tn.esprit.foyersae9.Repository.UniversiteRepository universiteRepository) {
        UniversiteRepository = universiteRepository;
    }


    public List<Universite> getAll(){
        return UniversiteRepository.findAll();
    };

    public Universite add(Universite Foyer){
        return UniversiteRepository.save(Foyer);


    }
    public void delete(Long Universite){
        UniversiteRepository.deleteById(Universite);


    }
    public Universite update(Universite Universite){
        return UniversiteRepository.save(Universite);
    }
}
