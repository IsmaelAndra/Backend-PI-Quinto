package backend.backend.Appointment.Consultory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="consultory")
public class Consultory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_consultory;
    @Column(length = 30)
    private String name_consultory;
    @Column(length = 30)
    private String address_consultory;
    @Column(length = 9)
    private Integer phone_consultory;

    public Consultory() {}
    public Consultory(String name_consultory, String address_consultory, Integer phone_consultory){
        this.name_consultory = name_consultory;
        this.address_consultory = address_consultory;
        this.phone_consultory = phone_consultory;
    }

    public Long getId_consultory() {
        return id_consultory;
    }

    public void setId_consultory(Long id_consultory) {
        this.id_consultory = id_consultory;
    }

    public String getName_consultory() {
        return name_consultory;
    }

    public void setName_consultory(String name_consultory) {
        this.name_consultory = name_consultory;
    }

    public String getAddress_consultory() {
        return address_consultory;
    }

    public void setAddress_consultory(String address_consultory) {
        this.address_consultory = address_consultory;
    }

    public Integer getPhone_consultory() {
        return phone_consultory;
    }

    public void setPhone_consultory(Integer phone_consultory) {
        this.phone_consultory = phone_consultory;
    }
}
