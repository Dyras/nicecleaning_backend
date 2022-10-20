package se.stadafint.nicecleaning_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.stadafint.nicecleaning_backend.model.User;
import se.stadafint.nicecleaning_backend.services.UserService;

@RestController
@RequestMapping("/api/user")
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
