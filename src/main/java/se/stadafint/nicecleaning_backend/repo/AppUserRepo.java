package se.stadafint.nicecleaning_backend.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.stadafint.nicecleaning_backend.model.AppUser;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Integer> {

    AppUser findSiteUserById(int id);

    AppUser findSiteUserByEmailIgnoreCase(String email);
}
