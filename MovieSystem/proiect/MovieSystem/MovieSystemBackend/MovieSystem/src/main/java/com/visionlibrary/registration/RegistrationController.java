package com.visionlibrary.registration;

import com.visionlibrary.model.Movie;
import com.visionlibrary.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {

    private final RegistrationService registrationService;

//    private final MovieService MovieService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        String result = registrationService.register(request);
        return result;
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }




//    @GetMapping("/all")
//    public List<Movie> getAllMovies () {
//        List<Movie> Movies = MovieService.findAllMovies();
//        return Movies;
//    }


}
