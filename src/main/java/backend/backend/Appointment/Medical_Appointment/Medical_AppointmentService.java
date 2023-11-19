package backend.backend.Appointment.Medical_Appointment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Medical_AppointmentService {
    @Autowired
    private Medical_AppointmentRepository medical_AppointmentRepository;

    //Crear
    public Medical_Appointment save(Medical_Appointment entity)
    {
        return medical_AppointmentRepository.save(entity);
    }

    //Leer
    public Medical_Appointment findById(long id_medical)
    {
        return medical_AppointmentRepository.findById(id_medical).orElse(null);
    }

    //Eliminar
    public void deleteByID (long id_medical)
    {
        medical_AppointmentRepository.deleteById(id_medical);
    }
    
    //Seleccionar Todo
    public List <Medical_Appointment> findAll()
    {
        return medical_AppointmentRepository.findAll();
    }
}
