package backend.backend.Diagnosis.Diagnosis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiagnosisService {
    @Autowired
    private DiagnosisRepository diagnosisRepository;

    //Crear
    public Diagnosis save(Diagnosis entity)
    {
        return diagnosisRepository.save(entity);
    }

    //Leer
    public Diagnosis findById(long id_diagnosis)
    {
        return diagnosisRepository.findById(id_diagnosis).orElse(null);
    }

    //Eliminar
    public void deleteByID(long id_diagnosis)
    {
        diagnosisRepository.deleteById(id_diagnosis);
    }
    
    //Seleccionar Todo
    public List <Diagnosis> findAll()
    {
        return diagnosisRepository.findAll();
    }
}
