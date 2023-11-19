package backend.backend.Diagnosis2.Diagnosis2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Diagnosis2Repository extends CrudRepository<Diagnosis2, Long> {
    List <Diagnosis2> findAll();
}
