package se.stadafint.nicecleaning_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.stadafint.nicecleaning_backend.model.SiteUser;
import se.stadafint.nicecleaning_backend.services.SiteUserService;

@RestController
@RequestMapping("/api/user")
public class SiteUserController {

    private final SiteUserService siteUserService;

    public SiteUserController(SiteUserService siteUserService){
        this.siteUserService = siteUserService;
    }

    @GetMapping
    public SiteUser findUserById(int id){
        return siteUserService.findUserById(id);
    }
}
