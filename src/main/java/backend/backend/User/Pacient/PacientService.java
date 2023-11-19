package backend.backend.User.Pacient;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacientService {
    @Autowired
    private PacientRepository pacientRepository;

    //Crear
    public Pacient save(Pacient entity)
    {
        return pacientRepository.save(entity);
    }

    //Leer
    public Pacient findById(long id_pacient)
    {
        return pacientRepository.findById(id_pacient).orElse(null);
    }

    //Eliminar
    public void deleteByID(long id_pacient)
    {
        pacientRepository.deleteById(id_pacient);
    }
    
    //Seleccionar Todo
    public List <Pacient> findAll()
    {
        return pacientRepository.findAll();
    }
}
