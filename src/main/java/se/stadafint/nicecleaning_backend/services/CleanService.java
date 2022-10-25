package se.stadafint.nicecleaning_backend.services;

import org.springframework.stereotype.Service;
import se.stadafint.nicecleaning_backend.entities.AppUser;
import se.stadafint.nicecleaning_backend.entities.Clean;
import se.stadafint.nicecleaning_backend.repo.AppUserRepo;
import se.stadafint.nicecleaning_backend.repo.CleanRepo;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

@Service
public class CleanService {
    private final CleanRepo cleanRepo;
    private final AppUserRepo appUserRepo;


    public CleanService(CleanRepo cleanRepo) {
        this.cleanRepo = cleanRepo;
    }

    public List<Clean> findAll(String contains) {
        return cleanRepo.findAll();
    }

    public Clean findById(int id){
        return cleanRepo.findById(id).orElseThrow();
    }

    public Clean addClean(String date, String time, String message, int userId){
        AppUser appUser = appUserRepo.findById(userId).orElseThrow();
    return cleanRepo.save(new Clean(date, time, message, 0, 0, appUser));
    }

    public Clean cleanDuplicateCheck(String date, int id) {
        return cleanRepo.findCleanByDateAndId(date, id);
        }

    }