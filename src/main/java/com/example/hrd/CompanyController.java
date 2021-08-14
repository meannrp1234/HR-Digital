package com.example.hrd;

import com.example.hrd.domain.Company;
import com.example.hrd.repo.CompanyRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CompanyController {
    private CompanyRepo repo;

    public CompanyController(CompanyRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/company/{id}")
    public Optional<Company> find(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping("/company")
    public Company save(@RequestBody Company s){
        return repo.save(s);
    }

    @GetMapping("/company")
    public Page<Company> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }
}
