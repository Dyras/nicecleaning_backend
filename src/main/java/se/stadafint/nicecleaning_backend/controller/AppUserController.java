package se.stadafint.nicecleaning_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.stadafint.nicecleaning_backend.model.AppUser;
import se.stadafint.nicecleaning_backend.services.AppUserService;

@RestController
@RequestMapping("/api/user")
public class AppUserController {

    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public AppUser findUserByEmail(String email){
        return appUserService.findAppUserByEmail(email);
    }
}
