package se.stadafint.nicecleaning_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.stadafint.nicecleaning_backend.entities.Clean;

public interface CleanRepo extends JpaRepository<Clean, Integer> {

    Clean findCleanByDateAndId(String date, int id);

    Clean findCleanById(int id);

}
