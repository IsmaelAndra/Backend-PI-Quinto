package backend.backend.User.User;

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
@RequestMapping("/api/user/")
@CrossOrigin({"*"})
public class UserController {
    @Autowired 
    private UserService userService;

    @PostMapping("/")
    public User save(@RequestBody User entity)
    {
        return userService.save(entity);
    }

    @GetMapping("/{id_user}/")
    public User findUser(@PathVariable long id_user)
    {
        return userService.findById(id_user);
    }
    
    @PutMapping("/{id_user}/")
    public User update(@RequestBody User entity)
    {
        return userService.save(entity);
    }

    @DeleteMapping("/{id_user}/")
    public void deleteByID(@PathVariable long id_user)
    {
        userService.deleteByID(id_user);
    }

    @GetMapping("/")
    public List<User> findAll()
    {
        return userService.findAll();
    }
}
