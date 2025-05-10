package klu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import klu.model.Investment;
import klu.repository.InvestmentRepository;

@RestController
@RequestMapping("/api/investments")
@CrossOrigin(origins = "*")
public class InvestmentController {

    @Autowired
    private InvestmentRepository investmentRepository;

    // GET method to retrieve all investments
    @GetMapping
    public List<Investment> getAllInvestments() {
        return investmentRepository.findAll();
    }

    // POST method to add a new investment
    @PostMapping
    public ResponseEntity<?> addInvestment(@RequestBody Investment investment) {
        try {
            Investment savedInvestment = investmentRepository.save(investment);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedInvestment);
        } catch (OptimisticLockingFailureException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict occurred while updating the investment. Please try again.");
        }
    }

    // DELETE method to remove an investment by its ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteInvestment(@PathVariable Integer id) {
        if (investmentRepository.existsById(id)) {
            investmentRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Investment deleted successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Investment not found.");
        }
    }
}
