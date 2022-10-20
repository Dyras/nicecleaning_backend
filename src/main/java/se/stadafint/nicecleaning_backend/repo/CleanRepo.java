package se.stadafint.nicecleaning_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.stadafint.nicecleaning_backend.model.Clean;

import java.util.Date;
import java.util.List;

public interface CleanRepo extends JpaRepository<Clean, Integer> {


    Clean findCleanByDateAndId(Date date, int id);
}
