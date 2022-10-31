package se.stadafint.nicecleaning_backend.services;


import org.springframework.stereotype.Service;
import se.stadafint.nicecleaning_backend.entities.AppUser;
import se.stadafint.nicecleaning_backend.entities.Clean;
import se.stadafint.nicecleaning_backend.repo.AppUserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {
    private final AppUserRepo appUserRepo;

    public AppUserService(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }

    public List<AppUser> findAll() {
        return appUserRepo.findAll();
    }

    public Optional<AppUser> findAppUserByEmail(String email){
        return appUserRepo.findAppUserByEmailIgnoreCase(email);
    }
    public AppUser findById(int id){
        return appUserRepo.findById(id).orElseThrow();
    }

}
