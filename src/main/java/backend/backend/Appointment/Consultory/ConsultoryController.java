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

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/consultory/")
@CrossOrigin({"*"})
public class ConsultoryController {
    @Autowired 
    private ConsultoryService consultoryService;

    @PostMapping("/")
    @Operation(summary = "Crear un Consultorio")
    public Consultory save(@RequestBody Consultory entity)
    {
        return consultoryService.save(entity);
    }

    @GetMapping("/{id_consultory}/")
    @Operation(summary = "Obtener un Consultorio")
    public Consultory findConsultory(@PathVariable long id_consultory)
    {
        return consultoryService.findById(id_consultory);
    }
    
    @PutMapping("/{id_consultory}/")
    @Operation(summary = "Actualizar un Consultorio")
    public Consultory update(@RequestBody Consultory entity)
    {
        return consultoryService.save(entity);
    }

    @DeleteMapping("/{id_consultory}/")
    @Operation(summary = "Eliminar un Consultorio")
    public void deleteByID(@PathVariable long id_consultory)
    {
        consultoryService.deleteByID(id_consultory);
    }

    @GetMapping("/")
    @Operation(summary = "Obtener todos los Consultorios")
    public List<Consultory> findAll()
    {
        return consultoryService.findAll();
    }
}
