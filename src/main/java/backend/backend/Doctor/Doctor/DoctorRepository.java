package backend.backend.Doctor.Doctor;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    List <Doctor> findAll();
}
