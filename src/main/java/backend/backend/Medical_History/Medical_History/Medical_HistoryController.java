package backend.backend.Medical_History.Medical_History;

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
@RequestMapping("/api/medical_history/")
@CrossOrigin({"*"})
public class Medical_HistoryController {
    @Autowired 
    private Medical_HistoryService medical_HistoryService;

    @PostMapping("/")
    public Medical_History save(@RequestBody Medical_History entity)
    {
        return medical_HistoryService.save(entity);
    }

    @GetMapping("/{id_medical_history}/")
    public Medical_History findMedical_History(@PathVariable long id_medical_history)
    {
        return medical_HistoryService.findById(id_medical_history);
    }
    
    @PutMapping("/{id_medical_history}/")
    public Medical_History update(@RequestBody Medical_History entity)
    {
        return medical_HistoryService.save(entity);
    }

    @DeleteMapping("/{id_medical_history}/")
    public void deleteByID(@PathVariable long id_medical_history)
    {
        medical_HistoryService.deleteByID(id_medical_history);
    }

    @GetMapping("/")
    public List<Medical_History> findAll()
    {
        return medical_HistoryService.findAll();
    }
}
