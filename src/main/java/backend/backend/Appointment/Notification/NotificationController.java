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

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/notification/")
@CrossOrigin({"*"})
public class NotificationController {
    @Autowired 
    private NotificationService notificationService;

    @PostMapping("/")
    @Operation(summary = "Crear una Notificación")
    public Notification save(@RequestBody Notification entity)
    {
        return notificationService.save(entity);
    }

    @GetMapping("/{id_notification}/")
    @Operation(summary = "Obtener una Notificación")
    public Notification findNotification(@PathVariable long id_rol)
    {
        return notificationService.findById(id_rol);
    }
    
    @PutMapping("/{id_notification}/")
    @Operation(summary = "Actualizar una Notificación")
    public Notification update(@RequestBody Notification entity)
    {
        return notificationService.save(entity);
    }

    @DeleteMapping("/{id_notification}/")
    @Operation(summary = "Eliminar una Notificación")
    public void deleteByID(@PathVariable long id_notification)
    {
        notificationService.deleteByID(id_notification);
    }

    @GetMapping("/")
    @Operation(summary = "Obtener todas las Notificaciones")
    public List<Notification> findAll()
    {
        return notificationService.findAll();
    }
}
