package backend.backend.Diagnosis.Exam;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepository extends CrudRepository<Exam, Long> {
    List <Exam> findAll();
}
