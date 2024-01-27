package com.codewithkali.backenddevelop.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Hospital{
    @Id
    @GeneratedValue
    private Long hospitalid;

    public Long getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(Long hospitalid) {
        this.hospitalid = hospitalid;
    }

    public String getHosname() {
        return hosname;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno= contactno;
    }



    private String hosname;
    private String  location;

    private String contactno;

}


