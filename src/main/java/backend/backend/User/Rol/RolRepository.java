package backend.backend.User.Rol;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<Rol, Long> {
    List <Rol> findAll();
}
