package backend.backend.Medical_History.Preparation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreparationService {
    @Autowired
    private PreparationRepository preparationRepository;

    //Crear
    public Preparation save(Preparation entity)
    {
        return preparationRepository.save(entity);
    }

    //Leer
    public Preparation findById(long id_preparation)
    {
        return preparationRepository.findById(id_preparation).orElse(null);
    }

    //Eliminar
    public void deleteByID(long id_preparation)
    {
        preparationRepository.deleteById(id_preparation);
    }
    
    //Seleccionar Todo
    public List <Preparation> findAll()
    {
        return preparationRepository.findAll();
    }
}
