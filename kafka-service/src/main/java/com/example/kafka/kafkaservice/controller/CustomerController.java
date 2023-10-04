package com.example.kafka.kafkaservice.controller;

import com.example.kafka.kafkaservice.dto.request.CustomerRegistrationRequest;
import com.example.kafka.kafkaservice.dto.response.GenericResponse;
import com.example.kafka.kafkaservice.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.kafka.kafkaservice.utils.constant.EndPoints.CUSTOMER;
import static com.example.kafka.kafkaservice.utils.constant.EndPoints.SIGN_UP;

@RestController(value = "CustomerController")
@RequestMapping(value = CUSTOMER)
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @PostMapping(value = SIGN_UP)
    private ResponseEntity<GenericResponse> signUp(@RequestBody CustomerRegistrationRequest request) {
        return ResponseEntity.ok(customerServiceImpl.signUp(request));
    }
}
