package backend.backend.Doctor.Speciality;

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
@RequestMapping("/api/speciality/")
@CrossOrigin({"*"})
public class SpecialityController {
    @Autowired 
    private SpecialityService specialityService;

    @PostMapping("/")
    @Operation(summary = "Crear una Especialidad")
    public Speciality save(@RequestBody Speciality entity)
    {
        return specialityService.save(entity);
    }

    @GetMapping("/{id_speciality}/")
    @Operation(summary = "Obtener una Especialidad")
    public Speciality findSpeciality(@PathVariable long id_speciality)
    {
        return specialityService.findById(id_speciality);
    }

    @PutMapping("/{id_speciality}/")
    @Operation(summary = "Actualizar una Especialidad")
    public Speciality update(@RequestBody Speciality entity)
    {
        return specialityService.save(entity);
    }

    @DeleteMapping("/{id_speciality}/")
    @Operation(summary = "Eliminar una Especialidad")
    public void deleteByID(@PathVariable long id_speciality)
    {
        specialityService.deleteByID(id_speciality);
    }

    @GetMapping("/")
    @Operation(summary = "Obtener todas las Especialidades")
    public List<Speciality> findAll()
    {
        return specialityService.findAll();
    }
}
