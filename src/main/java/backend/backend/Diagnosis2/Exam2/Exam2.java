package backend.backend.Diagnosis2.Exam2;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import backend.backend.Diagnosis2.Diagnosis2.Diagnosis2;
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
@Table(name="exam2")
public class Exam2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_exam2;
    @Column(length = 100)
    private String type_exam2;
    @Column
    @JsonFormat(pattern = "yyyy/MM/dd", shape = JsonFormat.Shape.STRING)
    private LocalDate date_exam2;
    @Column(length = 400)
    private String results_exam2;

    public Exam2() {}

    public Exam2(String type_exam2, LocalDate date_exam2, String results_exam2) {
        this.type_exam2 = type_exam2;
        this.date_exam2 = date_exam2;
        this.results_exam2 = results_exam2;
    }

    public Long getId_exam2() {
        return id_exam2;
    }

    public void setId_exam2(Long id_exam2) {
        this.id_exam2 = id_exam2;
    }

    public String getType_exam2() {
        return type_exam2;
    }

    public void setType_exam2(String type_exam2) {
        this.type_exam2 = type_exam2;
    }

    public LocalDate getDate_exam2() {
        return date_exam2;
    }

    public void setDate_exam2(LocalDate date_exam2) {
        this.date_exam2 = date_exam2;
    }

    public String getResults_exam2() {
        return results_exam2;
    }

    public void setResults_exam2(String results_exam2) {
        this.results_exam2 = results_exam2;
    }

    @ManyToOne
    @JoinColumn(name = "id_diagnosis2", referencedColumnName = "id_diagnosis2")
    private Diagnosis2 diagnosis2;
}
