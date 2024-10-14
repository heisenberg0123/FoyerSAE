package tn.esprit.foyersae9.ServiceI.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyersae9.Repository.BlocRepository;
import tn.esprit.foyersae9.ServiceI.Bloc;

import java.util.List;
@Service
public class BlocService implements Bloc {

private BlocRepository BlocRepository;

    public BlocService(tn.esprit.foyersae9.Repository.BlocRepository blocRepository) {
        BlocRepository = blocRepository;
    }

    @Override
    public List<tn.esprit.foyersae9.entity.Bloc> getAll() {
        return BlocRepository.findAll();
    }

    @Override
    public tn.esprit.foyersae9.entity.Bloc add(tn.esprit.foyersae9.entity.Bloc bloc) {
        return BlocRepository.save(bloc);
    }

    @Override
    public void delete(Long idBloc) {

    }

    @Override
    public tn.esprit.foyersae9.entity.Bloc update(tn.esprit.foyersae9.entity.Bloc Bloc) {
        return BlocRepository.save(Bloc);
    }
}
