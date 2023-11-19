package backend.backend.Medical_History.Medical_History;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Medical_HistoryService {
    @Autowired
    private Medical_HistoryRepository medical_HistoryRepository;

    //Crear
    public Medical_History save(Medical_History entity)
    {
        return medical_HistoryRepository.save(entity);
    }

    //Leer
    public Medical_History findById(long id_medical_history)
    {
        return medical_HistoryRepository.findById(id_medical_history).orElse(null);
    }

    //Eliminar
    public void deleteByID(long id_medical_history)
    {
        medical_HistoryRepository.deleteById(id_medical_history);
    }
    
    //Seleccionar Todo
    public List <Medical_History> findAll()
    {
        return medical_HistoryRepository.findAll();
    }
}
