package com.codewithkali.backenddevelop.controller;


import com.codewithkali.backenddevelop.model.Doctor;
import com.codewithkali.backenddevelop.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping("/doctor")
    Doctor newDoctor(@RequestBody Doctor newDoctor){
        return doctorRepository.save(newDoctor);
    }
    @GetMapping("/doctor")
    List<Doctor>getAllDoctor(){
        return doctorRepository.findAll();
    }
}

