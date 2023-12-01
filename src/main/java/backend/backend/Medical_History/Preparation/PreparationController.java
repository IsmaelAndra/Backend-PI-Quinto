package backend.backend.Medical_History.Preparation;

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
@RequestMapping("/api/preparation/")
@CrossOrigin({"*"})
public class PreparationController {
    @Autowired 
    private PreparationService preparationService;

    @PostMapping("/")
    @Operation(summary = "Crear una Preparación")
    public Preparation save(@RequestBody Preparation entity)
    {
        return preparationService.save(entity);
    }

    @GetMapping("/{id_preparation}/")
    @Operation(summary = "Obtener una Preparación")
    public Preparation findPreparation(@PathVariable long id_preparation)
    {
        return preparationService.findById(id_preparation);
    }
    
    @PutMapping("/{id_preparation}/")
    @Operation(summary = "Actualizar una Preparación")
    public Preparation update(@RequestBody Preparation entity)
    {
        return preparationService.save(entity);
    }

    @DeleteMapping("/{id_preparation}/")
    @Operation(summary = "Eliminar una Preparación")
    public void deleteByID(@PathVariable long id_preparation)
    {
        preparationService.deleteByID(id_preparation);
    }

    @GetMapping("/")
    @Operation(summary = "Obtener todas las Preparaciones")
    public List<Preparation> findAll()
    {
        return preparationService.findAll();
    }
}
