package com.codewithkali.backenddevelop.exception;

public class PatientNotFoundException extends Throwable {
    public PatientNotFoundException(Long patientid){
        super("could not found the patient with id" + patientid);
    }
}
