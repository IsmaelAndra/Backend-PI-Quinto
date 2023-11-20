package backend.backend.Doctor.Speciality;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="speciality")
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_speciality;
    @Column(length = 100, unique = true)
    private String name_speciality;
    @Column(length = 100)
    private String description_speciality;

    public Speciality(){}

    public Speciality(String name_speciality, String description_speciality) {
        this.name_speciality = name_speciality;
        this.description_speciality = description_speciality;
    }

    public long getId_speciality() {
        return id_speciality;
    }

    public void setId_speciality(long id_speciality) {
        this.id_speciality = id_speciality;
    }

    public String getName_speciality() {
        return name_speciality;
    }

    public void setName_speciality(String name_speciality) {
        this.name_speciality = name_speciality;
    }

    public String getDescription_speciality() {
        return description_speciality;
    }

    public void setDescription_speciality(String description_speciality) {
        this.description_speciality = description_speciality;
    }
}