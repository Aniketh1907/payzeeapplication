package com.project.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.jpa.model.SenderDetails;
@Repository
public interface SenderRepository extends JpaRepository<SenderDetails,Long>{
List<SenderDetails>findByCustomerId(long customerId);
}
