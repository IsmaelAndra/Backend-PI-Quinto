package backend.backend.Appointment.Medical_Appointment;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface Medical_AppointmentRepository extends CrudRepository<Medical_Appointment, Long> {
    List <Medical_Appointment> findAll();
}
