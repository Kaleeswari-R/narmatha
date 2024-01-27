package com.codewithkali.backenddevelop.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class HospitalNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(HospitalNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String>exceptionHandler(HospitalNotFoundException exception){
        Map<String,String>errorMap=new HashMap<>();
        errorMap.put("error msg",exception.getMessage());
        return errorMap;
    }

}