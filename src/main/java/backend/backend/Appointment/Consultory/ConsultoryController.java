package backend.backend.Appointment.Consultory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consultory/")
@CrossOrigin({"*"})
public class ConsultoryController {
    @Autowired 
    private ConsultoryService consultoryService;

    @PostMapping("/")
    public Consultory save(@RequestBody Consultory entity)
    {
        return consultoryService.save(entity);
    }

    @GetMapping("/{id_consultory}/")
    public Consultory findConsultory(@PathVariable long id_consultory)
    {
        return consultoryService.findById(id_consultory);
    }
    
    @PutMapping("/{id_consultory}/")
    public Consultory update(@RequestBody Consultory entity)
    {
        return consultoryService.save(entity);
    }

    @DeleteMapping("/{id_consultory}/")
    public void deleteByID(@PathVariable long id_consultory)
    {
        consultoryService.deleteByID(id_consultory);
    }

    @GetMapping("/")
    public List<Consultory> findAll()
    {
        return consultoryService.findAll();
    }
}
