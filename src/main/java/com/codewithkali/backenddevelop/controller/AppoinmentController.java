package com.codewithkali.backenddevelop.controller;
import com.codewithkali.backenddevelop.model.Appoinment;
import com.codewithkali.backenddevelop.repository.AppoinmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppoinmentController {
    @Autowired
    private AppoinmentRepository appoinmentrRepository;

    @PostMapping("/appoinment")
    Appoinment newAppoinment(@RequestBody Appoinment newAppoinment){
        return appoinmentrRepository.save(newAppoinment);
    }
    @GetMapping("/appoinment")
    List<Appoinment>getAllAppoinment(){
        return appoinmentrRepository.findAll();
    }
}


