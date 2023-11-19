package backend.backend.User.Rol;

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
@RequestMapping("/api/rol/")
@CrossOrigin({"*"})
public class RolController {
    @Autowired 
    private RolService rolService;

    @PostMapping("/")
    public Rol save(@RequestBody Rol entity)
    {
        return rolService.save(entity);
    }

    @GetMapping("/{id_rol}/")
    public Rol findRol(@PathVariable long id_rol)
    {
        return rolService.findById(id_rol);
    }
    
    @PutMapping("/{id_rol}/")
    public Rol update(@RequestBody Rol entity)
    {
        return rolService.save(entity);
    }

    @DeleteMapping("/{id_rol}/")
    public void deleteByID(@PathVariable long id_rol)
    {
        rolService.deleteByID(id_rol);
    }

    @GetMapping("/")
    public List<Rol> findAll()
    {
        return rolService.findAll();
    }
}
