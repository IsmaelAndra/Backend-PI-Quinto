package backend.backend.Appointment.Consultory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ConsultoryRepository extends CrudRepository<Consultory, Long> {
    List<Consultory> findAll();
}
