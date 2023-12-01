package backend.backend.Medical_History.Preparation;

import backend.backend.Appointment.Pay.Pay;
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
@Table(name="preparation")
public class Preparation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_preparation;
    @Column(length = 400)
    private String diagnostic_preparation;
    @Column(length = 300)
    private String treatment_preparation;
    @Column(length = 10)
    private String height_preparation;
    @Column(length = 10)
    private String weight_preparation;
    @Column(length = 10)
    private String oximetro_preparation;
    @Column(length = 10)
    private Integer tensiometro_preparation;

    public Preparation() {}

    public Preparation(Long id_preparation, String diagnostic_preparation, String treatment_preparation, String height_preparation, String weight_preparation, String oximetro_preparation, Integer tensiometro_preparation) {
        this.id_preparation = id_preparation;
        this.diagnostic_preparation = diagnostic_preparation;
        this.treatment_preparation = treatment_preparation;
        this.height_preparation = height_preparation;
        this.weight_preparation = weight_preparation;
        this.oximetro_preparation = oximetro_preparation;
        this.tensiometro_preparation = tensiometro_preparation;
    }

    public Long getId_preparation() {
        return id_preparation;
    }

    public void setId_preparation(Long id_preparation) {
        this.id_preparation = id_preparation;
    }

    public String getDiagnostic_preparation() {
        return diagnostic_preparation;
    }

    public void setDiagnostic_preparation(String diagnostic_preparation) {
        this.diagnostic_preparation = diagnostic_preparation;
    }

    public String getTreatment_preparation() {
        return treatment_preparation;
    }

    public void setTreatment_preparation(String treatment_preparation) {
        this.treatment_preparation = treatment_preparation;
    }

    public String getHeight_preparation() {
        return height_preparation;
    }

    public void setHeight_preparation(String height_preparation) {
        this.height_preparation = height_preparation;
    }

    public String getWeight_preparation() {
        return weight_preparation;
    }

    public void setWeight_preparation(String weight_preparation) {
        this.weight_preparation = weight_preparation;
    }

    public String getOximetro_preparation() {
        return oximetro_preparation;
    }

    public void setOximetro_preparation(String oximetro_preparation) {
        this.oximetro_preparation = oximetro_preparation;
    }

    public Integer getTensiometro_preparation() {
        return this.tensiometro_preparation;
    }

    public void setTensiometro_preparation(Integer tensiometro_preparation) {
        this.tensiometro_preparation = tensiometro_preparation;
    }

    @OneToOne
    @JoinColumn(name = "id_pay", referencedColumnName = "id_pay")
    private Pay pay;
}
