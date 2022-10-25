package se.stadafint.nicecleaning_backend.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.stadafint.nicecleaning_backend.entities.AppUser;

import java.util.Optional;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Integer> {


    Optional<AppUser> findAppUsersByUsernameIgnoreCase(String username);

    AppUser findAppUserByEmailIgnoreCase(String email);
}
