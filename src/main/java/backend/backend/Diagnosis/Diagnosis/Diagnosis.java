package backend.backend.Diagnosis.Diagnosis;

import backend.backend.Medical_History.Medical_History.Medical_History;
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
@Table(name="diagnosis")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id_diagnosis;
    @Column
    private String description_diagnosis;

    public Diagnosis() {}

    public Diagnosis(String description_diagnosis) {
        this.description_diagnosis = description_diagnosis;
    }

    public Long getId_diagnosis() {
        return id_diagnosis;
    }

    public void setId_diagnosis(Long id_diagnosis) {
        this.id_diagnosis = id_diagnosis;
    }

    public String getDescription_diagnosis() {
        return description_diagnosis;
    }

    public void setDescription_diagnosis(String description_diagnosis) {
        this.description_diagnosis = description_diagnosis;
    }

    // @OneToMany(mappedBy = "diagnosis", cascade = CascadeType.ALL)
    // private List <Exam> exam;

    // @OneToMany(mappedBy = "diagnosis", cascade = CascadeType.ALL)
    // private List <Prescription> prescription;

    @ManyToOne
    @JoinColumn(name = "id_medical_history", referencedColumnName = "id_medical_history")
    private Medical_History medical_history;
}