package backend.backend.User.User;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import backend.backend.User.Rol.Rol;
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
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_user;
    @Column
    private String name_user;
    @Column
    private String lastname_user;
    @Column
    @JsonFormat(pattern = "yyyy/MM/dd", shape = JsonFormat.Shape.STRING)
    private LocalDate dateofbirth_user;
    @Column
    private String gender_user;
    @Column
    private String address_user;
    @Column(unique = true)
    private Integer phone_user;
    @Column(unique = true)
    private String email_user;
    @Column
    private String password_user;
    @Column
    private String pass_verification_user;

    public User(){}

    public User(String name_user, String lastname_user, LocalDate dateofbirth_user, String gender_user, String address_user, Integer phone_user, String email_user, String password_user, String pass_verification_user) {
        this.name_user = name_user;
        this.lastname_user = lastname_user;
        this.dateofbirth_user = dateofbirth_user;
        this.gender_user = gender_user;
        this.address_user = address_user;
        this.phone_user = phone_user;
        this.email_user = email_user;
        this.password_user = password_user;
        this.pass_verification_user = pass_verification_user;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getLastname_user() {
        return lastname_user;
    }

    public void setLastname_user(String lastname_user) {
        this.lastname_user = lastname_user;
    }

    public LocalDate getDateofbirth_user() {
        return dateofbirth_user;
    }

    public void setDateofbirth_user(LocalDate dateofbirth_user) {
        this.dateofbirth_user = dateofbirth_user;
    }

    public String getGender_user() {
        return this.gender_user;
    }

    public void setGender_user(String gender_user) {
        this.gender_user = gender_user;
    }

    public String getAddress_user() {
        return this.address_user;
    }

    public void setAddress_user(String address_user) {
        this.address_user = address_user;
    }

    public Integer getPhone_user() {
        return phone_user;
    }

    public void setPhone_user(Integer phone_user) {
        this.phone_user = phone_user;
    }

    public String getEmail_user() {
        return email_user;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public String getPassword_user() {
        return password_user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

    public String getPass_verification_user() {
        return pass_verification_user;
    }

    public void setPass_verification_user(String pass_verification_user) {
        this.pass_verification_user = pass_verification_user;
    }

    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName="id_rol")
    private Rol rol;

    // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    // private List<Pacient> pacient;

    // @OneToOne(mappedBy = "user")
    // private Doctor doctor;

    // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    // private List<Diagnosis2> diagnosis2;
}
