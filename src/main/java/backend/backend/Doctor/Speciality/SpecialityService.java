package backend.backend.Doctor.Speciality;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {
    @Autowired
    private SpecialityRepository specialityRepository;

    //Crear
    public Speciality save(Speciality entity)
    {
        return specialityRepository.save(entity);
    }

    //Leer
    public Speciality findById(long id_speciality)
    {
        return specialityRepository.findById(id_speciality).orElse(null);
    }

    //Eliminar
    public void deleteByID (long id_speciality)
    {
        specialityRepository.deleteById(id_speciality);
    }
    
    //Seleccionar Todo
    public List <Speciality> findAll()
    {
        return specialityRepository.findAll();
    }
}