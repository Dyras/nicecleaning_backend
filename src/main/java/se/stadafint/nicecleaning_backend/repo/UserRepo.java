package se.stadafint.nicecleaning_backend.repo;

import se.stadafint.nicecleaning_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findUserById(int id);
}
