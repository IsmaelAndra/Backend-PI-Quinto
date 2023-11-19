package backend.backend.Doctor.Speciality;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
    List <Speciality> findAll();
}