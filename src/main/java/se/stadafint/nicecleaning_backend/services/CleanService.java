package se.stadafint.nicecleaning_backend.services;

import org.springframework.stereotype.Service;
import se.stadafint.nicecleaning_backend.entities.Clean;
import se.stadafint.nicecleaning_backend.entities.User;
import se.stadafint.nicecleaning_backend.repo.CleanRepo;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
public class CleanService {
    private final CleanRepo cleanRepo;

    public CleanService(CleanRepo cleanRepo) {
        this.cleanRepo = cleanRepo;
    }

    public List<Clean> findAll() {
        return cleanRepo.findAll();
    }

    public Clean findById(int id){
        return cleanRepo.findById(id).orElseThrow();
    }

    public Clean addClean(Date date, Time time){
    return cleanRepo.save(new Clean(date, time, false, (new User("Batman", "superman"))));
    }

    public Clean cleanDuplicateCheck(Date date, int id) {
        return cleanRepo.findCleanByDateAndId(date, id);
        }

    }