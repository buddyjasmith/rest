package com.example.employee.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.*;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
