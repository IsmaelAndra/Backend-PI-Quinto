package backend.backend.Appointment.Schedule;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    //Crear
    public Schedule save(Schedule entity)
    {
        return scheduleRepository.save(entity);
    }

    //Leer
    public Schedule findById(long id_schedule)
    {
        return scheduleRepository.findById(id_schedule).orElse(null);
    }

    //Eliminar
    public void deleteByID (long id_schedule)
    {
        scheduleRepository.deleteById(id_schedule);
    }
    
    //Seleccionar Todo
    public List <Schedule> findAll()
    {
        return scheduleRepository.findAll();
    }
}
