package backend.backend.Appointment.Notification;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface NotificationRepository extends CrudRepository<Notification, Long> {
    List <Notification> findAll();
}
