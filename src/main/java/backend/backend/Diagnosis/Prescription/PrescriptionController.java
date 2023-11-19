package backend.backend.Diagnosis.Prescription;

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
@RequestMapping("/api/prescription/")
@CrossOrigin({"*"})
public class PrescriptionController {
    @Autowired 
    private PrescriptionService prescriptionService;

    @PostMapping("/")
    public Prescription save(@RequestBody Prescription entity)
    {
        return prescriptionService.save(entity);
    }

    @GetMapping("/{id_prescription}/")
    public Prescription findPreparation(@PathVariable long id_prescription)
    {
        return prescriptionService.findById(id_prescription);
    }
    
    @PutMapping("/{id_prescription}/")
    public Prescription update(@RequestBody Prescription entity)
    {
        return prescriptionService.save(entity);
    }

    @DeleteMapping("/{id_prescription}/")
    public void deleteByID(@PathVariable long id_prescription)
    {
        prescriptionService.deleteByID(id_prescription);
    }

    @GetMapping("/")
    public List<Prescription> findAll()
    {
        return prescriptionService.findAll();
    }
}
