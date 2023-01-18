package com.visionlibrary.login;

import com.visionlibrary.appuser.AppUser;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/login")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public AppUser authenticate(@RequestBody LoginRequest request) {
        AppUser result = loginService.authenticate(request);
        return result;
    }

}
