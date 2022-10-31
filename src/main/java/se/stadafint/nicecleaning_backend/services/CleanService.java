package se.stadafint.nicecleaning_backend.services;

import org.springframework.stereotype.Service;
import se.stadafint.nicecleaning_backend.dto.CreateCleanDTO;
import se.stadafint.nicecleaning_backend.entities.AppUser;
import se.stadafint.nicecleaning_backend.entities.Clean;
import se.stadafint.nicecleaning_backend.repo.AppUserRepo;
import se.stadafint.nicecleaning_backend.repo.CleanRepo;

import java.util.List;

@Service
public class CleanService {
    private final CleanRepo cleanRepo;
    private final AppUserRepo appUserRepo;


    public CleanService(CleanRepo cleanRepo, AppUserRepo appUserRepo) {
        this.cleanRepo = cleanRepo;
        this.appUserRepo = appUserRepo;
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

    public void unscheduleClean(int id) {
        Clean clean = findById(id);
        clean.setStatus(8);
        cleanRepo.save(clean);

    }

    public void rescheduleClean(CreateCleanDTO createCleanDTO) {
        Clean clean = findById(createCleanDTO.id());
        clean.setDate(createCleanDTO.date());
        clean.setTime(createCleanDTO.time());
        clean.setStatus(0);
        clean.setCleanerId(0);
    }
}