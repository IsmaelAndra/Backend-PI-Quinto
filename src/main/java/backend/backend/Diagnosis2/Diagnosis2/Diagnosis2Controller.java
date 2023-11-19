package backend.backend.Diagnosis2.Diagnosis2;

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
@RequestMapping("/api/diagnosis2/")
@CrossOrigin({"*"})
public class Diagnosis2Controller {
    @Autowired 
    private Diagnosis2Service diagnosis2Service;

    @PostMapping("/")
    public Diagnosis2 save(@RequestBody Diagnosis2 entity)
    {
        return diagnosis2Service.save(entity);
    }

    @GetMapping("/{id_diagnosis2}/")
    public Diagnosis2 findDiagnosis2(@PathVariable long id_diagnosis2)
    {
        return diagnosis2Service.findById(id_diagnosis2);
    }
    
    @PutMapping("/{id_diagnosis2}/")
    public Diagnosis2 update(@RequestBody Diagnosis2 entity)
    {
        return diagnosis2Service.save(entity);
    }

    @DeleteMapping("/{id_diagnosis2}/")
    public void deleteByID(@PathVariable long id_diagnosis2)
    {
        diagnosis2Service.deleteByID(id_diagnosis2);
    }

    @GetMapping("/")
    public List<Diagnosis2> findAll()
    {
        return diagnosis2Service.findAll();
    }
}
