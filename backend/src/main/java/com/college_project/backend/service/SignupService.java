package com.college_project.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.college_project.backend.model.UserDetails;
import com.college_project.backend.repository.SignupRepo;

@Service
public class SignupService {
    
    // Constructor Injection is the best way
    private SignupRepo signupRepo;
    public SignupService(SignupRepo signupRepo) {
        this.signupRepo = signupRepo;
    }

    public void saveUser(UserDetails userDetails) {
        try{
            signupRepo.save(userDetails);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<UserDetails> getUsers() {
        return signupRepo.findAll();
    }
}
