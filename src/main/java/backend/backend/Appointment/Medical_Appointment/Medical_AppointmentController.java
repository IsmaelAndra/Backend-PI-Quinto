package backend.backend.Appointment.Medical_Appointment;

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
@RequestMapping("/api/medical_appointment/")
@CrossOrigin({"*"})
public class Medical_AppointmentController {
    @Autowired 
    private Medical_AppointmentService medical_AppointmentService;

    @PostMapping("/")
    public Medical_Appointment save(@RequestBody Medical_Appointment entity)
    {
        return medical_AppointmentService.save(entity);
    }

    @GetMapping("/{id_medical}/")
    public Medical_Appointment findMedical_Appointment(@PathVariable long id_medical)
    {
        return medical_AppointmentService.findById(id_medical);
    }
    
    @PutMapping("/{id_medical}/")
    public Medical_Appointment update(@RequestBody Medical_Appointment entity)
    {
        return medical_AppointmentService.save(entity);
    }

    @DeleteMapping("/{id_medical}/")
    public void deleteByID(@PathVariable long id_medical)
    {
        medical_AppointmentService.deleteByID(id_medical);
    }

    @GetMapping("/")
    public List<Medical_Appointment> findAll()
    {
        return medical_AppointmentService.findAll();
    }
}
