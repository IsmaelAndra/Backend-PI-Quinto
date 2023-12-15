package backend.backend.Auth.Services;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import backend.backend.Auth.Request.LoginRequest;
import backend.backend.Auth.Request.RegisterRequest;
import backend.backend.Auth.Response.AuthResponse;
import backend.backend.User.Rol.Rol;
import backend.backend.User.Rol.RolRepository;
import backend.backend.User.User.User;
import backend.backend.User.User.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JWTService jwtService;
    private final RolRepository rolRepository;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;

    public AuthResponse login(LoginRequest request) {
        try {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user = userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token = jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid username or password", e);
        }
    }

    public AuthResponse register(RegisterRequest request) {
        Rol userRole = rolRepository.findByNamerol("DOCTOR")
                .orElseThrow(() -> new RuntimeException("Role not found: USER"));
        
        String encodedPassword = passwordEncoder.encode(request.getPassword());
        String encodedPassword_Veri = passwordEncoder.encode(request.getPass_verification_user());

        User user = User.builder()
                .photo_user(request.getPhoto_user())
                .name_user(request.getName_user())
                .username(request.getUsername())
                .lastname_user(request.getLastname_user())
                .dateofbirth_user(request.getDateofbirth_user())
                .gender_user(request.getGender_user())
                .address_user(request.getAddress_user())
                .phone_user(request.getPhone_user())
                .email_user(request.getEmail_user())
                .password(encodedPassword)
                .pass_verification_user(encodedPassword_Veri)
                .rol(userRole)
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
