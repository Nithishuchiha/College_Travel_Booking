package com.college_project.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college_project.backend.model.UserDetails;

@Repository
/**
 * SignupRepo
 */
public interface SignupRepo extends JpaRepository<UserDetails, String> {

}
