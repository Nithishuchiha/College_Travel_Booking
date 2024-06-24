package com.college_project.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college_project.backend.model.RideDetails;
import com.college_project.backend.repository.RideRepo;

@Service
public class RideService {
    @Autowired
    private RideRepo rideRepo;

    public RideDetails saveDetails(RideDetails rideDetails){
        return rideRepo.save(rideDetails);
    }

    public List<RideDetails> getDetails(){
        return rideRepo.findAll();
    }

}
