package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import klu.model.Investment;
@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Integer> {
}