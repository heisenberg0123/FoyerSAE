package tn.esprit.foyersae9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyersae9.entity.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
