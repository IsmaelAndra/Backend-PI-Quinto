package backend.backend.Doctor.Doctor;
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
@RequestMapping("/api/doctor/")
@CrossOrigin({"*"})
public class DoctorController {
    @Autowired 
    private DoctorService doctorService;

    @PostMapping("/")
    @Operation(summary = "Crear un Doctor")
    public Doctor save(@RequestBody Doctor entity)
    {
        return doctorService.save(entity);
    }

    @GetMapping("/{id_doctor}/")
    @Operation(summary = "Obtener un Doctor")
    public Doctor findDoctor(@PathVariable long id_doctor)
    {
        return doctorService.findById(id_doctor);
    }
    
    @PutMapping("/{id_doctor}/")
    @Operation(summary = "Actualizar un Doctor")
    public Doctor update(@RequestBody Doctor entity)
    {
        return doctorService.save(entity);
    }

    @DeleteMapping("/{id_doctor}/")
    @Operation(summary = "Eliminar un Doctor")
    public void deleteByID(@PathVariable long id_doctor)
    {
        doctorService.deleteByID(id_doctor);
    }

    @GetMapping("/")
    @Operation(summary = "Obtener todos los Doctores")
    public List<Doctor> findAll()
    {
        return doctorService.findAll();
    }
}