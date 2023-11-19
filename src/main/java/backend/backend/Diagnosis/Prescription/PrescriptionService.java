package backend.backend.Diagnosis.Prescription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository prescriptionRepository;

    //Crear
    public Prescription save(Prescription entity)
    {
        return prescriptionRepository.save(entity);
    }

    //Leer
    public Prescription findById(long id_prescription)
    {
        return prescriptionRepository.findById(id_prescription).orElse(null);
    }

    //Eliminar
    public void deleteByID(long id_prescription)
    {
        prescriptionRepository.deleteById(id_prescription);
    }
    
    //Seleccionar Todo
    public List <Prescription> findAll()
    {
        return prescriptionRepository.findAll();
    }
}
