package backend.backend.Appointment.Pay;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;

import backend.backend.Appointment.Medical_Appointment.Medical_Appointment;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pay")
public class Pay {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id_pay;
    @Column
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime datetime_pay = LocalDateTime.now();
    @Column(length = 30)
    private String payment_method;
    @Column(length = 30)
    private String status_pay;

    public Pay() {}

    public Pay(String payment_method, String status_pay) {
        this.payment_method = payment_method;
        this.status_pay = status_pay;
    }

    public Long getId_pay() {
        return id_pay;
    }

    public void setId_pay(Long id_pay) {
        this.id_pay = id_pay;
    }

    public LocalDateTime getDatetime_pay() {
        return datetime_pay;
    }

    public void setDatetime_pay(LocalDateTime datetime_pay) {
        this.datetime_pay = datetime_pay;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getStatus_pay() {
        return status_pay;
    }

    public void setStatus_pay(String status_pay) {
        this.status_pay = status_pay;
    }

    @OneToOne
    @JoinColumn(name = "id_medical", referencedColumnName = "id_medical")
    private Medical_Appointment medical_appointment;
}
