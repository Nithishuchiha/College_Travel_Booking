package com.college_project.backend.service;

import org.springframework.stereotype.Service;

import com.college_project.backend.model.UserDetails;
import com.college_project.backend.repository.LoginRepo;

@Service
public class LoginService {
    LoginRepo loginRepo;
    LoginService(LoginRepo loginRepo)
    {
        this.loginRepo=loginRepo;
    }

    public boolean checkLoginCredentials(String email, String password) {
        UserDetails user = loginRepo.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
