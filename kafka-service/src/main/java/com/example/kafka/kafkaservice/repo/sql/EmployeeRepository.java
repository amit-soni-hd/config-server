package com.example.kafka.kafkaservice.repo.sql;

import com.example.kafka.kafkaservice.model.sql.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "EMPLOYEE_REPO")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
