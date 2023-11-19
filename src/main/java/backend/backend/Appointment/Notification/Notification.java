package backend.backend.Appointment.Notification;

import backend.backend.Appointment.Medical_Appointment.Medical_Appointment;
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
@Table(name="notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_notification;
    @Column
    private String type_notification;
    @Column
    private String messeger_notification;
    @Column
    private String shopping_date_notification;

    public Notification() {}

    public Notification(String type_notification, String messenger_notification, String shopping_date_notification) {
        this.type_notification = type_notification;
        this.messeger_notification = messenger_notification;
        this.shopping_date_notification = shopping_date_notification;
    }

    public Long getId_notification() {
        return id_notification;
    }

    public void setId_notification(Long id_notification) {
        this.id_notification = id_notification;
    }

    public String getType_notification() {
        return type_notification;
    }

    public void setType_notification(String type_notification) {
        this.type_notification = type_notification;
    }

    public String getMesseger_notification() {
        return messeger_notification;
    }

    public void setMesseger_notification(String messeger_notification) {
        this.messeger_notification = messeger_notification;
    }

    public String getShopping_date_notification() {
        return shopping_date_notification;
    }

    public void setShopping_date_notification(String shopping_date_notification) {
        this.shopping_date_notification = shopping_date_notification;
    }

    @ManyToOne
    @JoinColumn(name = "id_medical", referencedColumnName = "id_medical")
    private Medical_Appointment medical_appointment;
}
