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

@RestController
@RequestMapping("/api/exam/")
@CrossOrigin({"*"})
public class ExamController {
    @Autowired 
    private ExamService examService;

    @PostMapping("/")
    public Exam save(@RequestBody Exam entity)
    {
        return examService.save(entity);
    }

    @GetMapping("/{id_exam}/")
    public Exam findExam(@PathVariable long id_exam)
    {
        return examService.findById(id_exam);
    }
    
    @PutMapping("/{id_exam}/")
    public Exam update(@RequestBody Exam entity)
    {
        return examService.save(entity);
    }

    @DeleteMapping("/{id_exam}/")
    public void deleteByID(@PathVariable long id_exam)
    {
        examService.deleteByID(id_exam);
    }

    @GetMapping("/")
    public List<Exam> findAll()
    {
        return examService.findAll();
    }
}
