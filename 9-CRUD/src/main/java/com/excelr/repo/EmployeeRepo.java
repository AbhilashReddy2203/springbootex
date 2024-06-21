package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.EmployeeModel;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer> {

}
