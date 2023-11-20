package backend.backend.User.Rol;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_rol;
    @Column(length = 30)
    private String name_rol;
    @Column(length = 100)
    private String description_rol;

    public Rol() {}

    public Rol(String name_rol, String description_rol) {
        this.name_rol = name_rol;
        this.description_rol = description_rol;
    }

    public long getId_rol() {
        return id_rol;
    }

    public void setId_rol(long id_rol) {
        this.id_rol = id_rol;
    }

    public String getName_rol() {
        return name_rol;
    }

    public void setName_rol(String name_rol) {
        this.name_rol = name_rol;
    }

    public String getDescription_rol() {
        return description_rol;
    }

    public void setDescription_rol(String description_rol) {
        this.description_rol = description_rol;
    }

    // @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    // private List<User> user;
}
