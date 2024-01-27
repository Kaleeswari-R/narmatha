package com.codewithkali.backenddevelop.repository;

import com.codewithkali.backenddevelop.model.Appoinment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoinmentRepository extends JpaRepository<Appoinment,Long> {

}
