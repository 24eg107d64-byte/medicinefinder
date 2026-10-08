package jar.controller;

import jar.dto.LoginRequest;
import jar.dto.RegisterRequest;
import jar.entity.User;
import jar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole(request.getRole());

        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        User user = userService.login(
                request.getEmail(),
                request.getPassword());

        if (user != null) {
            return "Login Successful";
        }

        return "Invalid Credentials";
    }
}