package backend.backend.Appointment.Schedule;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_schedule;
    @Column
    private String weekday_schedule;
    @Column
    private String startime_schedule;
    @Column
    private String departime_schedule;

    public Schedule() {}

    public Schedule(String weekday_schedule, String startime_schedule, String departime_schedule) {
        this.weekday_schedule = weekday_schedule;
        this.startime_schedule = startime_schedule;
        this.departime_schedule = departime_schedule;
    }

    public long getId_schedule() {
        return id_schedule;
    }

    public void setId_schedule(long id_schedule) {
        this.id_schedule = id_schedule;
    }

    public String getWeekday_schedule() {
        return weekday_schedule;
    }

    public void setWeekday_schedule(String weekday_schedule) {
        this.weekday_schedule = weekday_schedule;
    }

    public String getStartime_schedule() {
        return startime_schedule;
    }

    public void setStartime_schedule(String startime_schedule) {
        this.startime_schedule = startime_schedule;
    }

    public String getDepartime_schedule() {
        return this.departime_schedule;
    }

    public void setDepartime_schedule(String departime_schedule) {
        this.departime_schedule = departime_schedule;
    }

    // @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    // private List<Medical_Appointment> medical_appointment;
}
