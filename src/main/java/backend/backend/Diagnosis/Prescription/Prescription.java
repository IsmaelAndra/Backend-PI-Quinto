package backend.backend.Diagnosis.Prescription;

import backend.backend.Diagnosis.Diagnosis.Diagnosis;
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
@Table(name="prescription")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_prescription;
    @Column
    private String medicine_prescription;
    @Column
    private String dose_prescription;
    @Column
    private String instructions_prescription;

    public Prescription() {}

    public Prescription(String medicine_prescription, String dose_prescription, String instructions_prescription) {
        this.medicine_prescription = medicine_prescription;
        this.dose_prescription = dose_prescription;
        this.instructions_prescription = instructions_prescription;
    }

    public Long getId_prescription() {
        return id_prescription;
    }

    public void setId_prescription(Long id_prescription) {
        this.id_prescription = id_prescription;
    }

    public String getMedicine_prescription() {
        return medicine_prescription;
    }

    public void setMedicine_prescription(String medicine_prescription) {
        this.medicine_prescription = medicine_prescription;
    }

    public String getDose_prescription() {
        return dose_prescription;
    }

    public void setDose_prescription(String dose_prescription) {
        this.dose_prescription = dose_prescription;
    }

    public String getInstructions_prescription() {
        return instructions_prescription;
    }

    public void setInstructions_prescription(String instructions_prescription) {
        this.instructions_prescription = instructions_prescription;
    }

    @ManyToOne
    @JoinColumn(name = "id_diagnosis", referencedColumnName = "id_diagnosis")
    private Diagnosis diagnosis;
}
