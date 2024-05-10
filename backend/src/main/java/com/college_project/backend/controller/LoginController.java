// package com.example.skcet_rapido.controller;
package com.college_project.backend.controller;
import org.springframework.web.bind.annotation.RestController;

import com.college_project.backend.service.LoginService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class LoginController
{
    LoginService loginService;
    LoginController(LoginService loginService)
    {
        this.loginService=loginService;
    }
    
    @GetMapping("/login/{email}/{password}")
    public String login(@PathVariable String email,@PathVariable String password) {
        if (loginService.checkLoginCredentials(email,password)) {
            // System.out.print("successful login");
            return "Login successful";
        } else {
            return "Invalid email or password";
        }
    }
    


   

}
