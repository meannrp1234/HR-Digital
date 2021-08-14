package com.example.hrd.repo;

import com.example.hrd.domain.LeaveMaxSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotaRepo extends JpaRepository<LeaveMaxSetting,Integer> {

}
