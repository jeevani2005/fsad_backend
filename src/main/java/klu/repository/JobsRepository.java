package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import klu.model.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, Long> {
}
