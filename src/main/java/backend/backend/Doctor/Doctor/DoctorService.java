package backend.backend.Doctor.Doctor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    //Crear
    public Doctor save(Doctor entity)
    {
        return doctorRepository.save(entity);
    }

    //Leer
    public Doctor findById(long id_doctor)
    {
        return doctorRepository.findById(id_doctor).orElse(null);
    }

    //Eliminar
    public void deleteByID (long id_doctor)
    {
        doctorRepository.deleteById(id_doctor);
    }
    
    //Seleccionar Todo
    public List <Doctor> findAll()
    {
        return doctorRepository.findAll();
    }
}
