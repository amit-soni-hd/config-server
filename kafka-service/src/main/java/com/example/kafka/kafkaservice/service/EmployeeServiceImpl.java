package com.example.kafka.kafkaservice.service;

import com.example.kafka.kafkaservice.dto.request.EmployeeRegisterRequest;
import com.example.kafka.kafkaservice.model.sql.Employee;
import com.example.kafka.kafkaservice.repo.sql.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "EMPLOYEE_SERVICE")
@Slf4j
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee registerEmployee(EmployeeRegisterRequest request) {
        return null;
    }

    public List<Employee> registerAllEmployee(List<EmployeeRegisterRequest> employees) {
        return null;
    }

    public static void main(String[] args) {

    }
}
