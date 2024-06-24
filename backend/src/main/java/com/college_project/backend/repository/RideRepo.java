package com.college_project.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college_project.backend.model.RideDetails;

@Repository
public interface RideRepo extends JpaRepository<RideDetails,Integer> {
    
} 