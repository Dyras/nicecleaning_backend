package se.stadafint.nicecleaning_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.stadafint.nicecleaning_backend.dto.AppUserResponseDTO;
import se.stadafint.nicecleaning_backend.entities.AppUser;
import se.stadafint.nicecleaning_backend.services.AppUserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class AppUserController {

    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUserResponseDTO> findAllUsers(){
        return appUserService.findAll()
                .stream()
                .map(AppUser::toResponseDTO)
                .toList();
    }

 /*   @GetMapping
    public AppUser findUserByEmail(String email){
        return appUserService.findAppUserByEmail(email);
    }
*/



}
