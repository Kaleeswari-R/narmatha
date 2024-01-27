package com.codewithkali.backenddevelop.repository;

import com.codewithkali.backenddevelop.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {
}
