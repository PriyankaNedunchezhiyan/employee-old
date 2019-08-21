package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Model;

public interface AdminRepo extends JpaRepository<Model, Long> {

	

}
