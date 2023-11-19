package backend.backend.Diagnosis2.Exam2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Exam2Service {
    @Autowired
    private Exam2Repository exam2Repository;

    //Crear
    public Exam2 save(Exam2 entity)
    {
        return exam2Repository.save(entity);
    }

    //Leer
    public Exam2 findById(long id_exam2)
    {
        return exam2Repository.findById(id_exam2).orElse(null);
    }

    //Eliminar
    public void deleteByID(long id_exam2)
    {
        exam2Repository.deleteById(id_exam2);
    }
    
    //Seleccionar Todo
    public List <Exam2> findAll()
    {
        return exam2Repository.findAll();
    }
}
