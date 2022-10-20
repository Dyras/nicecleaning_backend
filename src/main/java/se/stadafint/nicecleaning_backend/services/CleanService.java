package se.stadafint.nicecleaning_backend.services;

import org.springframework.stereotype.Service;
import se.stadafint.nicecleaning_backend.model.Clean;
import se.stadafint.nicecleaning_backend.repo.CleanRepo;

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
}
