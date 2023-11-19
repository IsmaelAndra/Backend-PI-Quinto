package backend.backend.Diagnosis2.Diagnosis2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Diagnosis2Service {
    @Autowired
    private Diagnosis2Repository diagnosis2Repository;

    //Crear
    public Diagnosis2 save(Diagnosis2 entity)
    {
        return diagnosis2Repository.save(entity);
    }

    //Leer
    public Diagnosis2 findById(long id_diagnosis2)
    {
        return diagnosis2Repository.findById(id_diagnosis2).orElse(null);
    }

    //Eliminar
    public void deleteByID(long id_diagnosis2)
    {
        diagnosis2Repository.deleteById(id_diagnosis2);
    }
    
    //Seleccionar Todo
    public List <Diagnosis2> findAll()
    {
        return diagnosis2Repository.findAll();
    }
}
