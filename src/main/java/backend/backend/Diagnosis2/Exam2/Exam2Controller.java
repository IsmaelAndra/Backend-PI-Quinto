package backend.backend.Diagnosis2.Exam2;

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
@RequestMapping("/api/exam2/")
@CrossOrigin({"*"})
public class Exam2Controller {
    @Autowired 
    private Exam2Service exam2Service;

    @PostMapping("/")
    @Operation(summary = "Crear un Examen 2")
    public Exam2 save(@RequestBody Exam2 entity)
    {
        return exam2Service.save(entity);
    }

    @GetMapping("/{id_exam2}/")
    @Operation(summary = "Obtener un Examen 2")
    public Exam2 findExam2(@PathVariable long id_exam2)
    {
        return exam2Service.findById(id_exam2);
    }
    
    @PutMapping("/{id_exam2}/")
    @Operation(summary = "Actualizar un Examen 2")
    public Exam2 update(@RequestBody Exam2 entity)
    {
        return exam2Service.save(entity);
    }

    @DeleteMapping("/{id_exam2}/")
    @Operation(summary = "Eliminar un Examen 2")
    public void deleteByID(@PathVariable long id_exam2)
    {
        exam2Service.deleteByID(id_exam2);
    }

    @GetMapping("/")
    @Operation(summary = "Obtener todos los Examenes 2")
    public List<Exam2> findAll()
    {
        return exam2Service.findAll();
    }
}
