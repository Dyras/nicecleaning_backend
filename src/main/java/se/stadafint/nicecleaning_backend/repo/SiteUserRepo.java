package se.stadafint.nicecleaning_backend.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.stadafint.nicecleaning_backend.model.SiteUser;

@Repository
public interface SiteUserRepo extends JpaRepository<SiteUser, Integer> {

    SiteUser findUserById(int id);
}
