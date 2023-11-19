package backend.backend.User.Pacient;

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
@RequestMapping("/api/pacient/")
@CrossOrigin({"*"})
public class PacientController {
    @Autowired 
    private PacientService pacientService;

    @PostMapping("/")
    public Pacient save(@RequestBody Pacient entity)
    {
        return pacientService.save(entity);
    }

    @GetMapping("/{id_pacient}/")
    public Pacient findPacient(@PathVariable long id_pacient)
    {
        return pacientService.findById(id_pacient);
    }
    
    @PutMapping("/{id_pacient}/")
    public Pacient update(@RequestBody Pacient entity)
    {
        return pacientService.save(entity);
    }

    @DeleteMapping("/{id_pacient}/")
    public void deleteByID(@PathVariable long id_pacient)
    {
        pacientService.deleteByID(id_pacient);
    }

    @GetMapping("/")
    public List<Pacient> findAll()
    {
        return pacientService.findAll();
    }
}
