package backend.backend.Appointment.Schedule;

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
@RequestMapping("/api/schedule/")
@CrossOrigin({"*"})
public class ScheduleController {
    @Autowired 
    private ScheduleService scheduleService;

    @PostMapping("/")
    public Schedule save(@RequestBody Schedule entity)
    {
        return scheduleService.save(entity);
    }

    @GetMapping("/{id_schedule}/")
    public Schedule findSchedule(@PathVariable long id_schedule)
    {
        return scheduleService.findById(id_schedule);
    }
    
    @PutMapping("/{id_schedule}/")
    public Schedule update(@RequestBody Schedule entity)
    {
        return scheduleService.save(entity);
    }

    @DeleteMapping("/{id_schedule}/")
    public void deleteByID(@PathVariable long id_schedule)
    {
        scheduleService.deleteByID(id_schedule);
    }

    @GetMapping("/")
    public List<Schedule> findAll()
    {
        return scheduleService.findAll();
    }
}
