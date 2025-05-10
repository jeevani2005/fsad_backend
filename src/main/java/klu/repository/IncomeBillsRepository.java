package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import klu.model.IncomeBills;

@Repository
public interface IncomeBillsRepository extends JpaRepository<IncomeBills, Long> {
}
