package tn.esprit.foyersae9.ServiceI;

import java.util.List;

public interface Bloc {

    public List<tn.esprit.foyersae9.entity.Bloc> getAll();



    public tn.esprit.foyersae9.entity.Bloc add(tn.esprit.foyersae9.entity.Bloc bloc);



    public void delete(Long idBloc);



    public tn.esprit.foyersae9.entity.Bloc update(tn.esprit.foyersae9.entity.Bloc Bloc);

}
