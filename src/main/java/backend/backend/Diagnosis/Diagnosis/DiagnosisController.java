package backend.backend.Diagnosis.Diagnosis;

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
@RequestMapping("/api/diagnosis/")
@CrossOrigin({"*"})
public class DiagnosisController {
    @Autowired 
    private DiagnosisService diagnosisService;

    @PostMapping("/")
    public Diagnosis save(@RequestBody Diagnosis entity)
    {
        return diagnosisService.save(entity);
    }

    @GetMapping("/{id_diagnosis}/")
    public Diagnosis findDiagnosis(@PathVariable long id_diagnosis)
    {
        return diagnosisService.findById(id_diagnosis);
    }
    
    @PutMapping("/{id_diagnosis}/")
    public Diagnosis update(@RequestBody Diagnosis entity)
    {
        return diagnosisService.save(entity);
    }

    @DeleteMapping("/{id_diagnosis}/")
    public void deleteByID(@PathVariable long id_diagnosis)
    {
        diagnosisService.deleteByID(id_diagnosis);
    }

    @GetMapping("/")
    public List<Diagnosis> findAll()
    {
        return diagnosisService.findAll();
    }
}
