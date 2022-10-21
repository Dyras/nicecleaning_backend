package se.stadafint.nicecleaning_backend.services;


import org.springframework.stereotype.Service;
import se.stadafint.nicecleaning_backend.model.SiteUser;
import se.stadafint.nicecleaning_backend.repo.SiteUserRepo;

@Service
public class SiteUserService {
    private final SiteUserRepo siteUserRepo;

    public SiteUserService(SiteUserRepo siteUserRepo) {
        this.siteUserRepo = siteUserRepo;
    }

    public SiteUser findUserById(int id) {
        return siteUserRepo.findUserById(id);
    }
}
