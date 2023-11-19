package backend.backend.Doctor.Doctor;

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
    @Column
    private String schedule_work_doctor;

    public Doctor(){}

    public Doctor(String schedule_work_doctor){
        this.schedule_work_doctor = schedule_work_doctor;
    }

    public long getId_doctor(){
        return this.id_doctor;
    }

    public void setId_doctor(long id_doctor) {
        this.id_doctor = id_doctor;
    }

    public String getSchedule_work_doctor() {
        return this.schedule_work_doctor;
    }

    public void setSchedule_work_doctor(String schedule_work_doctor) {
        this.schedule_work_doctor = schedule_work_doctor;
    }

    @ManyToOne
    @JoinColumn(name = "id_speciality", referencedColumnName = "id_speciality")
    private Speciality speciality;

    // @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    // private List<Medical_Appointment> medical_appointment;

    @OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;
}