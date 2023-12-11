package backend.backend.User.User;

import java.time.LocalDate;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_user;
    @Column(length = 500)
    private String photo_user;
    @Column(length = 30)
    private String name_user;
    @Column(length = 30, unique = true)
    private String username;
    @Column(length = 30)
    private String lastname_user;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate dateofbirth_user;
    @Column(length = 30)
    private String gender_user;
    @Column(length = 30)
    private String address_user;
    @Column(length = 9, unique = true)
    private Integer phone_user;
    @Column(length = 100, unique = true)
    private String email_user;
    @Column
    private String password;
    @Column
    private String pass_verification_user;
    
    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName="id_rol")
    private Rol rol;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority((rol.getNamerol())));
    }

    @Override
    public boolean isAccountNonExpired() {
         return true;
    }
    @Override
    public boolean isAccountNonLocked() {
         return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
         return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
