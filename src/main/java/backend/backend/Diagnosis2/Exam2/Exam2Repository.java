package backend.backend.Diagnosis2.Exam2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Exam2Repository extends CrudRepository<Exam2, Long> {
    List <Exam2> findAll();
}
