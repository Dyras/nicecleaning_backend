package se.stadafint.nicecleaning_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.stadafint.nicecleaning_backend.repo.CleanRepo;
import se.stadafint.nicecleaning_backend.repo.UserRepo;

@SpringBootApplication
public class NicecleaningBackendApplication {

    @Autowired
    CleanRepo cleanRepo;

    @Autowired
    UserRepo userRepo;

    public static void main(String[] args) {
        SpringApplication.run(NicecleaningBackendApplication.class, args);

    }

}