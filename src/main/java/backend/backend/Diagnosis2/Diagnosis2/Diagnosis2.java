package backend.backend.Diagnosis2.Diagnosis2;

import backend.backend.User.User.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="diagnosis2")
public class Diagnosis2 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id_diagnosis2;
    @Column(length = 400)
    private String description_diagnosis2;

    public Diagnosis2() {}

    public Diagnosis2(String description_diagnosis2) {
        this.description_diagnosis2 = description_diagnosis2;
    }

    public Long getId_diagnosis2() {
        return id_diagnosis2;
    }

    public void setId_diagnosis2(Long id_diagnosis2) {
        this.id_diagnosis2 = id_diagnosis2;
    }

    public String getDescription_diagnosis2() {
        return description_diagnosis2;
    }

    public void setDescription_diagnosis2(String description_diagnosis2) {
        this.description_diagnosis2 = description_diagnosis2;
    }

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;
}
