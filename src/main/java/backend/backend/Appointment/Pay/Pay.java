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
    private String card_name;
    @Column(length = 16)
    private Number card_number;
    @Column(length = 2)
    private Number expiration_month;
    @Column(length = 2)
    private Number expiration_year;
    @Column(length = 3)
    private Number security_code;
    @Column(length = 30)
    private String status_pay;

    public Pay(Long id_pay, String payment_method, String card_name, Number card_number, Number expiration_month, Number expiration_year, Number security_code, String status_pay) {
        this.id_pay = id_pay;
        this.payment_method = payment_method;
        this.card_name = card_name;
        this.card_number = card_number;
        this.expiration_month = expiration_month;
        this.expiration_year = expiration_year;
        this.security_code = security_code;
        this.status_pay = status_pay;
    }

    public Pay() {}

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

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public Number getCard_number() {
        return card_number;
    }

    public void setCard_number(Number card_number) {
        this.card_number = card_number;
    }

    public Number getExpiration_month(){
        return expiration_month;
    }

    public void setExpiration_month(Number expiration_month) {
        this.expiration_month = expiration_month;
    }

    public Number getExpiration_year(){
        return expiration_year;
    }

    public void setExpiration_year(Number expiration_year) {
        this.expiration_year = expiration_year;
    }

    public Number getSecurity_code() {
        return security_code;
    }

    public void setSecurity_code(Number security_code) {
        this.security_code = security_code;
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
