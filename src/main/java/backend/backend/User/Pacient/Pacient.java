package backend.backend.User.Pacient;

import com.fasterxml.jackson.annotation.JsonFormat;
import backend.backend.User.User.User;
import java.time.LocalDate;
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
@Table(name="pacient")
public class Pacient {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id_pacient;
    @Column(length = 30, unique = true)
    private Integer identification_pacient;
    @Column(length = 30)
    private String name_pacient;
    @Column(length = 30)
    private String lastname_pacient;
    @Column
    @JsonFormat(pattern = "yyyy/MM/dd", shape = JsonFormat.Shape.STRING)
    private LocalDate dateofbirth_pacient;
    @Column(length = 30)
    private String gender_pacient;
    @Column(length = 30)
    private String address_pacient;
    @Column(length = 9)
    private Integer phone_pacient;
    @Column(length = 5)
    private String blood_type_pacient;

    public Pacient() {}

    public Pacient(Integer identification_pacient, String name_pacient, String lastname_pacient, LocalDate dateofbirth_pacient, String gender_pacient, String address_pacient, Integer phone_pacient, String blood_type_pacient) {
        this.identification_pacient = identification_pacient;
        this.name_pacient = name_pacient;
        this.lastname_pacient = lastname_pacient;
        this.dateofbirth_pacient = dateofbirth_pacient;
        this.gender_pacient = gender_pacient;
        this.address_pacient = address_pacient;
        this.phone_pacient = phone_pacient;
        this.blood_type_pacient = blood_type_pacient;
    }

    public Long getId_pacient() {
        return id_pacient;
    }

    public void setId_pacient(Long id_pacient) {
        this.id_pacient = id_pacient;
    }

    public Integer getIdentification_pacient() {
        return identification_pacient;
    }

    public void setIdentification_pacient(Integer identification_pacient) {
        this.identification_pacient = identification_pacient;
    }

    public String getName_pacient() {
        return name_pacient;
    }

    public void setName_pacient(String name_pacient) {
        this.name_pacient = name_pacient;
    }

    public String getLastname_pacient() {
        return lastname_pacient;
    }

    public void setLastname_pacient(String lastname_pacient) {
        this.lastname_pacient = lastname_pacient;
    }

    public LocalDate getDateofbirth_pacient() {
        return dateofbirth_pacient;
    }

    public void setDateofbirth_pacient(LocalDate dateofbirth_pacient) {
        this.dateofbirth_pacient = dateofbirth_pacient;
    }

    public String getGender_pacient() {
        return gender_pacient;
    }

    public void setGender_pacient(String gender_pacient) {
        this.gender_pacient = gender_pacient;
    }

    public String getAddress_pacient() {
        return address_pacient;
    }

    public void setAddress_pacient(String address_pacient) {
        this.address_pacient = address_pacient;
    }

    public Integer getPhone_pacient() {
        return phone_pacient;
    }

    public void setPhone_pacient(Integer phone_pacient) {
        this.phone_pacient = phone_pacient;
    }

    public String getBlood_type_pacient() {
        return blood_type_pacient;
    }

    public void setBlood_type_pacient(String blood_type_pacient) {
        this.blood_type_pacient = blood_type_pacient;
    }

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName="id_user")
    private User user;
}
