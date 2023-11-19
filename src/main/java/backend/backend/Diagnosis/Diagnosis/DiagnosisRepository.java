package backend.backend.Diagnosis.Diagnosis;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DiagnosisRepository extends CrudRepository<Diagnosis, Long> {
    List <Diagnosis> findAll();
}