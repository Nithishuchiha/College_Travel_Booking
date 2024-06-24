package com.college_project.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college_project.backend.model.RideDetails;
import com.college_project.backend.service.RideService;

@RequestMapping("/api")
@RestController
public class RideController {
    RideService rideService;
    RideController(RideService rideService){
        this.rideService = rideService;
    }

    @PostMapping("/details")
    public RideDetails createDetails(@RequestBody RideDetails rideDetails){
        return rideService.saveDetails(rideDetails);
    }

    @GetMapping("/details")
    public List<RideDetails> getDetails(){
        return rideService.getDetails();
    }    
}
