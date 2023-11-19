package backend.backend.Appointment.Pay;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {
    @Autowired
    private PayRepository payRepository;

    //Crear
    public Pay save(Pay entity)
    {
        return payRepository.save(entity);
    }

    //Leer
    public Pay findById(long id_pay)
    {
        return payRepository.findById(id_pay).orElse(null);
    }

    //Eliminar
    public void deleteByID (long id_pay)
    {
        payRepository.deleteById(id_pay);
    }
    
    //Seleccionar Todo
    public List <Pay> findAll()
    {
        return payRepository.findAll();
    }
}
