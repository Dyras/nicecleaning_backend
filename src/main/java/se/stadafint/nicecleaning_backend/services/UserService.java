package se.stadafint.nicecleaning_backend.services;


import org.springframework.stereotype.Service;
import se.stadafint.nicecleaning_backend.model.User;
import se.stadafint.nicecleaning_backend.repo.UserRepo;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User findUserById(int id) {
        return userRepo.findUserById(id);
    }
}
