package backend.backend.Diagnosis.Exam;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name="exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_exam;
    @Column
    private String type_exam;
    @Column
    @JsonFormat(pattern = "yyyy/MM/dd", shape = JsonFormat.Shape.STRING)
    private LocalDate date_exam;
    @Column
    private String results_exam;

    public Exam() {}

    public Exam(String type_exam, LocalDate date_exam, String results_exam) {
        this.type_exam = type_exam;
        this.date_exam = date_exam;
        this.results_exam = results_exam;
    }

    public Long getId_exam() {
        return id_exam;
    }

    public void setId_exam(Long id_exam) {
        this.id_exam = id_exam;
    }

    public String getType_exam() {
        return type_exam;
    }

    public void setType_exam(String type_exam) {
        this.type_exam = type_exam;
    }

    public LocalDate getDate_exam() {
        return date_exam;
    }

    public void setDate_exam(LocalDate date_exam) {
        this.date_exam = date_exam;
    }

    public String getResults_exam() {
        return results_exam;
    }

    public void setResults_exam(String results_exam) {
        this.results_exam = results_exam;
    }

    @ManyToOne
    @JoinColumn(name = "id_diagnosis", referencedColumnName = "id_diagnosis")
    private Diagnosis diagnosis;
}
