package backend.backend.Appointment.Medical_Appointment;

import java.time.LocalDate;
import java.time.LocalTime;
import com.fasterxml.jackson.annotation.JsonFormat;

import backend.backend.Appointment.Consultory.Consultory;
import backend.backend.Appointment.Schedule.Schedule;
import backend.backend.Doctor.Doctor.Doctor;
import backend.backend.User.Pacient.Pacient;
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
@Table(name="medical_appointment")
public class Medical_Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_medical;
    @Column
    @JsonFormat(pattern = "yyyy/MM/dd", shape = JsonFormat.Shape.STRING)
    private LocalDate date_medical;
    @Column
    @JsonFormat(pattern = "HH:mm", shape = JsonFormat.Shape.STRING)
    private LocalTime time_medical;
    @Column
    private String speciality_medical;
    @Column
    private String status_medical;
    @Column
    private String reason_medical;

    public Medical_Appointment() {}

    public Medical_Appointment(LocalDate date_medical, LocalTime time_medical, String speciality_medical, String status_medical, String reason_medical) {
        this.date_medical = date_medical;
        this.time_medical = time_medical;
        this.speciality_medical = speciality_medical;
        this.status_medical = status_medical;
        this.reason_medical = reason_medical;
    }

    public Long getId_medical() {
        return id_medical;
    }

    public void setId_medical(Long id_medical) {
        this.id_medical = id_medical;
    }

    public LocalDate getDate_medical() {
        return date_medical;
    }

    public void setDate_medical(LocalDate date_medical) {
        this.date_medical = date_medical;
    }

    public LocalTime getTime_medical() {
        return time_medical;
    }

    public void setTime_medical(LocalTime time_medical) {
        this.time_medical = time_medical;
    }

    public String getSpeciality_medical() {
        return speciality_medical;
    }

    public void setSpeciality_medical(String speciality_medical) {
        this.speciality_medical = speciality_medical;
    }

    public String getStatus_medical() {
        return status_medical;
    }

    public void setStatus_medical(String status_medical) {
        this.status_medical = status_medical;
    }

    public String getReason_medical() {
        return reason_medical;
    }

    public void setReason_medical(String reason_medical) {
        this.reason_medical = reason_medical;
    }

    @ManyToOne
    @JoinColumn(name = "id_schedule", referencedColumnName="id_schedule")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "id_consultory", referencedColumnName="id_consultory")
    private Consultory consultory;

    @ManyToOne
    @JoinColumn(name = "id_pacient", referencedColumnName="id_pacient")
    private Pacient pacient;

    @ManyToOne
    @JoinColumn(name = "id_doctor", referencedColumnName="id_doctor")
    private Doctor doctor;

    // @OneToMany(mappedBy = "medical_appointment", cascade = CascadeType.ALL)
    // private List<Notification> notification;

    // @OneToOne(mappedBy = "medical_appointment")
    // private Pay pay;
}
