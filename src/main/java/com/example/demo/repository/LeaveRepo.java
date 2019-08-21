package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LeaveManage;

public interface LeaveRepo extends JpaRepository<LeaveManage,Long>{



}
