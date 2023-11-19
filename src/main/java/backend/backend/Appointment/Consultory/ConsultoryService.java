package backend.backend.Appointment.Consultory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultoryService {
    @Autowired
    private ConsultoryRepository consultoryRepository;

    //Crear
    public Consultory save(Consultory entity)
    {
        return consultoryRepository.save(entity);
    }

    //Leer
    public Consultory findById(long id_consultory)
    {
        return consultoryRepository.findById(id_consultory).orElse(null);
    }

    //Eliminar
    public void deleteByID (long id_consultory)
    {
        consultoryRepository.deleteById(id_consultory);
    }
    
    //Seleccionar Todo
    public List <Consultory> findAll()
    {
        return consultoryRepository.findAll();
    }
}
