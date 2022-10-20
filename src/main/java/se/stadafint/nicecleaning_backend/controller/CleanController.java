package se.stadafint.nicecleaning_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.stadafint.nicecleaning_backend.services.CleanService;

@RestController
@RequestMapping("/api/clean")
@CrossOrigin(origins = {"http://localhost:3000"}, methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST})
public class CleanController {

    private final CleanService cleanService;

    public CleanController(CleanService cleanService){
        this.cleanService = cleanService;
    }
}