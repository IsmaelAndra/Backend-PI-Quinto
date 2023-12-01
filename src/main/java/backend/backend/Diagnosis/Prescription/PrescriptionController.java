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

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/prescription/")
@CrossOrigin({"*"})
public class PrescriptionController {
    @Autowired 
    private PrescriptionService prescriptionService;

    @PostMapping("/")
    @Operation(summary = "Crear una Receta Médica")
    public Prescription save(@RequestBody Prescription entity)
    {
        return prescriptionService.save(entity);
    }

    @GetMapping("/{id_prescription}/")
    @Operation(summary = "Obtener una Receta Médica")
    public Prescription findPreparation(@PathVariable long id_prescription)
    {
        return prescriptionService.findById(id_prescription);
    }
    
    @PutMapping("/{id_prescription}/")
    @Operation(summary = "Actualizar una Receta Médica")
    public Prescription update(@RequestBody Prescription entity)
    {
        return prescriptionService.save(entity);
    }

    @DeleteMapping("/{id_prescription}/")
    @Operation(summary = "Eliminar una Receta Médica")
    public void deleteByID(@PathVariable long id_prescription)
    {
        prescriptionService.deleteByID(id_prescription);
    }

    @GetMapping("/")
    @Operation(summary = "Obtener todas las Recetas Médicas")
    public List<Prescription> findAll()
    {
        return prescriptionService.findAll();
    }
}
