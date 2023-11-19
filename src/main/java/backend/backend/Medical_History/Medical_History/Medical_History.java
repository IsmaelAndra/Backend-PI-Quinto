package backend.backend.Medical_History.Medical_History;

import backend.backend.Medical_History.Preparation.Preparation;
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
@Table(name="medical_history")
public class Medical_History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_medical_history;

    public Medical_History() {}

    public Long getId_medical_history() {
        return id_medical_history;
    }

    public void setId_medical_history(Long id_medical_history) {
        this.id_medical_history = id_medical_history;
    }

    @ManyToOne
    @JoinColumn(name = "id_preparation", referencedColumnName = "id_preparation")
    private Preparation preparation;

    // @OneToMany(mappedBy = "medical_history", cascade = CascadeType.ALL)
    // private List<Diagnosis> diagnosis;
}
