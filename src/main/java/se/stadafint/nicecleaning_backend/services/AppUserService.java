package se.stadafint.nicecleaning_backend.services;


import org.springframework.stereotype.Service;
import se.stadafint.nicecleaning_backend.model.AppUser;
import se.stadafint.nicecleaning_backend.repo.AppUserRepo;

@Service
public class AppUserService {
    private final AppUserRepo appUserRepo;

    public AppUserService(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }

    public AppUser findAppUserByEmail(String email){
        return appUserRepo.findAppUserByEmailIgnoreCase(email);
    }
}
