package com.codewithkali.backenddevelop.controller;
import com.codewithkali.backenddevelop.exception.HospitalNotFoundException;
import com.codewithkali.backenddevelop.model.Hospital;
import com.codewithkali.backenddevelop.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HospitalController {
    @Autowired
    private HospitalRepository hospitalRepository;

    @PostMapping("/hospital")
    Hospital newHospital(@RequestBody Hospital newHospital){
        return hospitalRepository.save(newHospital);
    }
    @GetMapping("/hospital")
    List<Hospital> getAllPatient(){
        return hospitalRepository.findAll();
    }

    @PutMapping("/hospital/{hospitalid}")
    Hospital updateHospital(@RequestBody Hospital newHospital, @PathVariable Long hospitalid){
        return hospitalRepository.findById(hospitalid).map(hospital -> {
            hospital.setHosname(newHospital.getHosname());
            hospital.setContactno(newHospital.getContactno());
            return hospitalRepository.save(hospital);
        }).orElseThrow();
    }

    @DeleteMapping("/hospital/{hospitalid}")
    String deleteHospital(@PathVariable Long hospitalid) throws HospitalNotFoundException {
        if(!hospitalRepository.existsById(hospitalid)){
            throw new HospitalNotFoundException(hospitalid);
        }
        hospitalRepository.deleteById(hospitalid);
        return "Hospital with Hospitalid " +hospitalid+ "has been deleted successfully.";
    }

}


