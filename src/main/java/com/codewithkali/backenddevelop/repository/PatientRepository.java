package com.codewithkali.backenddevelop.repository;

import com.codewithkali.backenddevelop.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {


}
