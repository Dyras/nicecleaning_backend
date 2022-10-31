package se.stadafint.nicecleaning_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataIntegrityViolationException;
import se.stadafint.nicecleaning_backend.entities.AppUser;
import se.stadafint.nicecleaning_backend.entities.Clean;
import se.stadafint.nicecleaning_backend.repo.CleanRepo;
import se.stadafint.nicecleaning_backend.repo.AppUserRepo;
import se.stadafint.nicecleaning_backend.services.AppUserService;


import java.util.Optional;


@SpringBootApplication
public class NicecleaningBackendApplication implements CommandLineRunner {

    @Autowired
    CleanRepo cleanRepo;
    @Autowired
    AppUserService appUserService;
    @Autowired
    AppUserRepo appUserRepo;


    public static void main(String[] args) {
        SpringApplication.run(NicecleaningBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try{
            Optional<AppUser> optionalUser = appUserService.findAppUserByEmail("johan.forsberg@my.com");
            AppUser appUser = optionalUser.get();
            cleanRepo.save(new Clean("2022-10-31", "10:2", "Hej grupp 1!", 0, 0, appUser));
        }catch (DataIntegrityViolationException err )  {
            System.out.println(err.getMessage());
        }

    }

}