package se.stadafint.nicecleaning_backend.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.stadafint.nicecleaning_backend.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findUserById(int id);
}
