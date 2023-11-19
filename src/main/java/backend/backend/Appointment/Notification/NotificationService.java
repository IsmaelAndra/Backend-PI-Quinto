package backend.backend.Appointment.Notification;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    //Crear
    public Notification save(Notification entity)
    {
        return notificationRepository.save(entity);
    }

    //Leer
    public Notification findById(long id_notification)
    {
        return notificationRepository.findById(id_notification).orElse(null);
    }

    //Eliminar
    public void deleteByID (long id_notification)
    {
        notificationRepository.deleteById(id_notification);
    }
    
    //Seleccionar Todo
    public List <Notification> findAll()
    {
        return notificationRepository.findAll();
    }
}
