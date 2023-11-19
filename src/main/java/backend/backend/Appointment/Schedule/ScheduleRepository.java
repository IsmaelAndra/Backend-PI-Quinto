package backend.backend.Appointment.Schedule;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
    List <Schedule> findAll();
}
