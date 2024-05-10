package com.college_project.backend.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college_project.backend.model.UserDetails;
import com.college_project.backend.service.SignupService;

@RestController
public class SignupController {
    
    private SignupService signupService;
    public SignupController(SignupService signupService) {
        this.signupService = signupService;
    }

    @GetMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserDetails userDetails) {
        try{
            signupService.saveUser(userDetails);
            return new ResponseEntity<String>("User added to database", HttpStatus.ACCEPTED);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("Internal Error in database", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/testing/getUsers")
    public List<UserDetails> getUsers() {
        return signupService.getUsers();
    }
        
}
