package backend.backend.Diagnosis.Prescription;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {
    List <Prescription> findAll();
}
