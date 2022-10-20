package se.stadafint.nicecleaning_backend.controller;

import se.stadafint.nicecleaning_backend.entities.User;
import org.springframework.web.bind.annotation.*;
import se.stadafint.nicecleaning_backend.services.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = {"http://localhost:3000"}, methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST})
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public User findUserById(int id){
        return userService.findUserById(id);
    }
}
