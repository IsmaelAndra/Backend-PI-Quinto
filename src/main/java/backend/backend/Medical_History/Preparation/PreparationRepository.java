package backend.backend.Medical_History.Preparation;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PreparationRepository extends CrudRepository<Preparation, Long> {
    List <Preparation> findAll();
}
