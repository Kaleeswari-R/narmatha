package com.codewithkali.backenddevelop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Doctor {
    @Id
    @GeneratedValue
    private Long doctorid;
    private String doctorname;
    private String specialization;
    private LocalDateTime availabletime;

    public Long getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Long doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public LocalDateTime getAvailabletime() {
        return availabletime;
    }

    public void setAvailabletime(LocalDateTime availabletime) {
        this.availabletime = availabletime;
    }
}
