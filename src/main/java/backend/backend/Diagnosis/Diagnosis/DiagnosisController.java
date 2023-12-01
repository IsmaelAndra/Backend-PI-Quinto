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

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/diagnosis/")
@CrossOrigin({"*"})
public class DiagnosisController {
    @Autowired 
    private DiagnosisService diagnosisService;

    @PostMapping("/")
    @Operation(summary = "Crear un Diagnostico")
    public Diagnosis save(@RequestBody Diagnosis entity)
    {
        return diagnosisService.save(entity);
    }

    @GetMapping("/{id_diagnosis}/")
    @Operation(summary = "Obtener un Diagnostico")
    public Diagnosis findDiagnosis(@PathVariable long id_diagnosis)
    {
        return diagnosisService.findById(id_diagnosis);
    }
    
    @PutMapping("/{id_diagnosis}/")
    @Operation(summary = "Actualizar un Diagnostico")
    public Diagnosis update(@RequestBody Diagnosis entity)
    {
        return diagnosisService.save(entity);
    }

    @DeleteMapping("/{id_diagnosis}/")
    @Operation(summary = "Eliminar un Diagnostico")
    public void deleteByID(@PathVariable long id_diagnosis)
    {
        diagnosisService.deleteByID(id_diagnosis);
    }

    @GetMapping("/")
    @Operation(summary = "Obtener todos los Diagnosticos")
    public List<Diagnosis> findAll()
    {
        return diagnosisService.findAll();
    }
}
