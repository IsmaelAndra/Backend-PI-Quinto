package backend.backend.Medical_History.Medical_History;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface Medical_HistoryRepository extends CrudRepository<Medical_History, Long> {
    List <Medical_History> findAll();
}
