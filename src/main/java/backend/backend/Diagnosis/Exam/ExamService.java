package backend.backend.Diagnosis.Exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {
    @Autowired
    private ExamRepository examRepository;

    //Crear
    public Exam save(Exam entity)
    {
        return examRepository.save(entity);
    }

    //Leer
    public Exam findById(long id_exam)
    {
        return examRepository.findById(id_exam).orElse(null);
    }

    //Eliminar
    public void deleteByID(long id_exam)
    {
        examRepository.deleteById(id_exam);
    }
    
    //Seleccionar Todo
    public List <Exam> findAll()
    {
        return examRepository.findAll();
    }
}
