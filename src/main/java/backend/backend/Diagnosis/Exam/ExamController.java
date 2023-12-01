package backend.backend.Diagnosis.Exam;

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
@RequestMapping("/api/exam/")
@CrossOrigin({"*"})
public class ExamController {
    @Autowired 
    private ExamService examService;

    @PostMapping("/")
    @Operation(summary = "Crear un Examen")
    public Exam save(@RequestBody Exam entity)
    {
        return examService.save(entity);
    }

    @GetMapping("/{id_exam}/")
    @Operation(summary = "Obtener un Examen")
    public Exam findExam(@PathVariable long id_exam)
    {
        return examService.findById(id_exam);
    }
    
    @PutMapping("/{id_exam}/")
    @Operation(summary = "Actualizar un Examen")
    public Exam update(@RequestBody Exam entity)
    {
        return examService.save(entity);
    }

    @DeleteMapping("/{id_exam}/")
    @Operation(summary = "Eliminar un Examen")
    public void deleteByID(@PathVariable long id_exam)
    {
        examService.deleteByID(id_exam);
    }

    @GetMapping("/")
    @Operation(summary = "Obtener todos los Examenes")
    public List<Exam> findAll()
    {
        return examService.findAll();
    }
}
