package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee_attendance;

public interface AttendanceRepo extends JpaRepository<Employee_attendance, Long>{

}
