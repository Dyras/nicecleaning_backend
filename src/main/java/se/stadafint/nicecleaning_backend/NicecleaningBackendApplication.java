package se.stadafint.nicecleaning_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.stadafint.nicecleaning_backend.entities.AppUser;
import se.stadafint.nicecleaning_backend.entities.Clean;
import se.stadafint.nicecleaning_backend.repo.CleanRepo;
import se.stadafint.nicecleaning_backend.repo.AppUserRepo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class NicecleaningBackendApplication {

    @Autowired
    CleanRepo cleanRepo;

    @Autowired
    AppUserRepo appUserRepo;

    public static void main(String[] args) {
        SpringApplication.run(NicecleaningBackendApplication.class, args);
       // new Clean("2022-10-24", "15:30", 0, "Placeholder", false, (new AppUser("johan.forsberg@my.com", "Supersecret")) );
    }

}