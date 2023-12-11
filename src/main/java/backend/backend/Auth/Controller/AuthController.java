package backend.backend.Auth.Controller;

import org.springframework.web.bind.annotation.RestController;

import backend.backend.Auth.Request.LoginRequest;
import backend.backend.Auth.Request.RegisterRequest;
import backend.backend.Auth.Response.AuthResponse;
import backend.backend.Auth.Services.AuthService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/auth")
@CrossOrigin({"*"})
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value="login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request)
    {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value="register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request)
    {
        return ResponseEntity.ok(authService.register(request));
    }
}