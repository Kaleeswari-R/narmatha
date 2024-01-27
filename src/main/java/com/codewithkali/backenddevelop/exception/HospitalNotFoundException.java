package com.codewithkali.backenddevelop.exception;

public class HospitalNotFoundException extends Throwable {

        public HospitalNotFoundException(Long hospitalid){
            super("could not found the hospital with id" + hospitalid);
        }


}
