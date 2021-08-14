package com.example.hrd;

import com.example.hrd.domain.LeaveMaxSetting;
import com.example.hrd.repo.LeaveMaxSettingRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LeaveMaxSettingController {
    private LeaveMaxSettingRepo repo;

    public LeaveMaxSettingController(LeaveMaxSettingRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/leave_max_setting/{id}")
    public Optional<LeaveMaxSetting> find(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping("/leave_max_setting")
    public LeaveMaxSetting save(@RequestBody LeaveMaxSetting quota){
        return repo.save(quota);
    }

    @GetMapping("/leave_max_setting")
    public Page<LeaveMaxSetting> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }
}
