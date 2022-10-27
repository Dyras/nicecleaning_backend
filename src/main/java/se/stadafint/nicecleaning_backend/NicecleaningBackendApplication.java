package se.stadafint.nicecleaning_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataIntegrityViolationException;
import se.stadafint.nicecleaning_backend.controller.AppUserController;
import se.stadafint.nicecleaning_backend.entities.AppUser;
import se.stadafint.nicecleaning_backend.entities.Clean;
import se.stadafint.nicecleaning_backend.entities.Role;
import se.stadafint.nicecleaning_backend.repo.CleanRepo;
import se.stadafint.nicecleaning_backend.repo.AppUserRepo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

@SpringBootApplication
public class NicecleaningBackendApplication implements CommandLineRunner {

    @Autowired
    CleanRepo cleanRepo;

    @Autowired
    AppUserRepo appUserRepo;


    public static void main(String[] args) {
        SpringApplication.run(NicecleaningBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try{
            appUserRepo.save(new AppUser("johan.forsberg@gmail.com", "1234", Set.of(Role.ADMIN)));
            appUserRepo.save(new AppUser("johan.forsberg@my.com", "1234", Set.of(Role.CUSTOMER)));
        }catch (DataIntegrityViolationException err )  {
            System.out.println(err.getMessage());
        }

    }

}