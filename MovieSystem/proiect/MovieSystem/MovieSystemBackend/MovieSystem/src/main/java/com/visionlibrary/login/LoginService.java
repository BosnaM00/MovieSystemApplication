package com.visionlibrary.login;

import com.visionlibrary.appuser.AppUser;
import com.visionlibrary.appuser.AppUserRole;
import com.visionlibrary.appuser.AppUserService;
import com.visionlibrary.mail.EmailSender;
import com.visionlibrary.registration.EmailValidator;
import com.visionlibrary.registration.token.ConfirmationToken;
import com.visionlibrary.registration.token.ConfirmationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class LoginService {
    private final AppUserService appUserService;

    public AppUser authenticate(LoginRequest request) {
        AppUser appUser = appUserService.authenticate(request);
        return appUser;
    }
}
