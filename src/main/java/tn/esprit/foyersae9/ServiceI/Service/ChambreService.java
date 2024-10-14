package tn.esprit.foyersae9.ServiceI.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyersae9.Repository.ChambreRepository;
import tn.esprit.foyersae9.ServiceI.Bloc;
import tn.esprit.foyersae9.ServiceI.Chambre;

import java.util.List;
@Service
public class ChambreService implements Chambre {


    @Override
    public List<tn.esprit.foyersae9.entity.Chambre> getAll() {
        return null;
    }

    @Override
    public tn.esprit.foyersae9.entity.Chambre add(tn.esprit.foyersae9.entity.Chambre Chambre) {
        return null;
    }

    @Override
    public void delete(Long idChambre) {

    }

    @Override
    public tn.esprit.foyersae9.entity.Chambre update(tn.esprit.foyersae9.entity.Chambre Chambre) {
        return null;
    }
}


