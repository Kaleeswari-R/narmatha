package com.codewithkali.backenddevelop.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Appoinment {
    @Id
    @GeneratedValue
    private Long doctorid;
    private String Patientpno;
    private String Patientname;
    private String Patientaddress;
    private String paymentamount;

    public Long getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Long doctorid) {
        this.doctorid = doctorid;
    }

    public String getPatientpno() {
        return Patientpno;
    }

    public void setPatientpno(String patientpno) {
        Patientpno = patientpno;
    }

    public String getPatientname() {
        return Patientname;
    }

    public void setPatientname(String patientname) {
        Patientname = patientname;
    }

    public String getPatientaddress() {
        return Patientaddress;
    }

    public void setPatientaddress(String patientaddress) {
        Patientaddress = patientaddress;
    }

    public String getPaymentamount() {
        return paymentamount;
    }

    public void setPaymentamount(String paymentamount) {
        this.paymentamount = paymentamount;
    }
}







