package backend.backend.Appointment.Pay;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PayRepository extends CrudRepository<Pay, Long> {
    List <Pay> findAll();
}
