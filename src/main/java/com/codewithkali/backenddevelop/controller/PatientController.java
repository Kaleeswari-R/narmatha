package com.codewithkali.backenddevelop.controller;



import com.codewithkali.backenddevelop.exception.PatientNotFoundException;
import com.codewithkali.backenddevelop.model.Patient;
import com.codewithkali.backenddevelop.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @PostMapping("/patient")
    Patient newPatient(@RequestBody Patient newPatient){
        return patientRepository.save(newPatient);
    }
    @GetMapping("/patient")
    List<Patient>getAllPatient(){
        return patientRepository.findAll();
    }
    @GetMapping("/patient/{patientid}")
    Patient getPatientById(@PathVariable Long patientid) throws PatientNotFoundException {
        return patientRepository.findById(patientid).orElseThrow(()->new PatientNotFoundException(patientid));
    }
    @PutMapping("/patient/{patientid}")
    Patient updatePatient(@RequestBody Patient newPatient, @PathVariable Long patientid){
        return patientRepository.findById(patientid).map(patient-> {
            patient.setPatientname(newPatient.getPatientname());
            patient.setPhno(newPatient.getPhno());
            return patientRepository.save(patient);

        }).orElseThrow();
    }
    @DeleteMapping("/patient/{patientid}")
    String deletePatient(@PathVariable Long patientid) throws PatientNotFoundException {
        if(!patientRepository.existsById(patientid)){
            throw new PatientNotFoundException(patientid);
        }
    patientRepository.deleteById(patientid);
        return "Patient with patientid " +patientid+ "has been deleted successfully.";
    }

}