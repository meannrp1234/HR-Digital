package com.example.hrd;

import com.example.hrd.domain.EmployeeType;
import com.example.hrd.repo.EmployeeTypeRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeTypeController {
    private EmployeeTypeRepo repo;

    public EmployeeTypeController(EmployeeTypeRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/employee_type/{id}")
    public Optional<EmployeeType> find(@PathVariable Integer id){
        return repo.findById(id);
    }

    @PostMapping("/employee_type")
    public EmployeeType save(@RequestBody EmployeeType s){
        return repo.save(s);
    }

    @GetMapping("/employee_type")
    public Page<EmployeeType> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }
}
