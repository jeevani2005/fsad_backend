// IncomeBillsController.java
package klu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import klu.model.IncomeBills;
import klu.repository.IncomeBillsRepository;
import java.util.List;

@RestController
@RequestMapping("/api/income-bills")
@CrossOrigin(origins = "http://localhost:5173") // React URL
public class IncomeBillsController {

    @Autowired
    private IncomeBillsRepository repository;

    @PostMapping
    public IncomeBills submitIncomeBills(@RequestBody IncomeBills bills) {
        return repository.save(bills);
    }

    @GetMapping
    public List<IncomeBills> getAllEntries() {
        return repository.findAll();
    }
}
