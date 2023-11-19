package backend.backend.Appointment.Notification;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification/")
@CrossOrigin({"*"})
public class NotificationController {
    @Autowired 
    private NotificationService notificationService;

    @PostMapping("/")
    public Notification save(@RequestBody Notification entity)
    {
        return notificationService.save(entity);
    }

    @GetMapping("/{id_notification}/")
    public Notification findNotification(@PathVariable long id_rol)
    {
        return notificationService.findById(id_rol);
    }
    
    @PutMapping("/{id_notification}/")
    public Notification update(@RequestBody Notification entity)
    {
        return notificationService.save(entity);
    }

    @DeleteMapping("/{id_notification}/")
    public void deleteByID(@PathVariable long id_notification)
    {
        notificationService.deleteByID(id_notification);
    }

    @GetMapping("/")
    public List<Notification> findAll()
    {
        return notificationService.findAll();
    }
}
