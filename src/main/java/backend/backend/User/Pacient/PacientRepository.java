package backend.backend.User.Pacient;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PacientRepository extends CrudRepository<Pacient, Long> {
    List<Pacient> findAll();
}
