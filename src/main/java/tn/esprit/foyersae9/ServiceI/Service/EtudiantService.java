package tn.esprit.foyersae9.ServiceI.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyersae9.Repository.EtudiantRepository;
import tn.esprit.foyersae9.entity.Chambre;
import tn.esprit.foyersae9.entity.Etudiant;

import java.util.List;
@Service
public class EtudiantService {

    private EtudiantRepository EtudiantRepository;

    public EtudiantService(tn.esprit.foyersae9.Repository.EtudiantRepository etudiantRepository) {
        EtudiantRepository = etudiantRepository;
    }

    public List<Etudiant> getAll(){
        return EtudiantRepository.findAll();
    };

    public Etudiant add(Etudiant Etudiant){
        return EtudiantRepository.save(Etudiant);


    }
    public void delete(Long idChambre){
        EtudiantRepository.deleteById(idChambre);


    }
    public Etudiant update(Etudiant Chambre){
        return EtudiantRepository.save(Chambre);
    }

}
