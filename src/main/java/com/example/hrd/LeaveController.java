package com.example.hrd;

import com.example.hrd.domain.Leave;
import com.example.hrd.repo.LeaveRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class LeaveController {
    private LeaveRepo repo;

    public LeaveController(LeaveRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/leave/{id}")
    public Optional<Leave> find(@PathVariable Integer id){
        return repo.findById(id);
    }

    @PostMapping("/leave")
    public Leave save(@RequestBody Leave s){
        return repo.save(s);
    }

    @GetMapping("/leave")
    public Page<Leave> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }

}
