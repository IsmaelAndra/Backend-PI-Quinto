package backend.backend.Doctor.Doctor;

import java.time.LocalTime;
import com.fasterxml.jackson.annotation.JsonFormat;

import backend.backend.Doctor.Speciality.Speciality;
import backend.backend.User.User.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_doctor;
    @Column(length = 50)
    private String working_day_doctor;
    @Column
    @JsonFormat(pattern = "HH:mm", shape = JsonFormat.Shape.STRING)
    private LocalTime startime_doctor;
    @Column
    @JsonFormat(pattern = "HH:mm", shape = JsonFormat.Shape.STRING)
    private LocalTime departime_doctor;

    public Doctor(String working_day_doctor) {
        this.working_day_doctor = working_day_doctor;
    }

    public Doctor(long id_doctor, String working_day_doctor, LocalTime startime_doctor, LocalTime departime_doctor){
        this.id_doctor = id_doctor;
        this.working_day_doctor = working_day_doctor;
        this.startime_doctor = startime_doctor;
        this.departime_doctor = departime_doctor;
    }

    public Doctor(){}

    public long getId_doctor(){
        return this.id_doctor;
    }

    public void setId_doctor(long id_doctor) {
        this.id_doctor = id_doctor;
    }

    public String getWorking_day_doctor() {
        return this.working_day_doctor;
    }

    public void setWorking_day_doctor(String working_day_doctor) {
        this.working_day_doctor = working_day_doctor;
    }

    public LocalTime getStartime_doctor() {
        return this.startime_doctor;
    }

    public void setStartime_doctor(LocalTime startime_doctor) {
        this.startime_doctor = startime_doctor;
    }

    public LocalTime getDepartime_doctor() {
        return this.departime_doctor;
    }

    public void setDepartime_doctor(LocalTime departime_doctor) {
        this.departime_doctor = departime_doctor;
    }

    @ManyToOne
    @JoinColumn(name = "id_speciality", referencedColumnName = "id_speciality")
    private Speciality speciality;

    @OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;
}