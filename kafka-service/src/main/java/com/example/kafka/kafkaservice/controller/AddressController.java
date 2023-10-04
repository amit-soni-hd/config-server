package com.example.kafka.kafkaservice.controller;

import com.example.kafka.kafkaservice.dto.request.AddressRequest;
import com.example.kafka.kafkaservice.dto.response.GenericResponse;
import com.example.kafka.kafkaservice.service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.kafka.kafkaservice.utils.constant.EndPoints.ADDRESS;
import static com.example.kafka.kafkaservice.utils.constant.EndPoints.ADD;

@RestController(value = "AddressController")
@RequestMapping(value = ADDRESS)
public class AddressController {

    @Autowired
    private AddressServiceImpl addressService;

    @PostMapping(value = ADD)
    private ResponseEntity<GenericResponse> signUp(@RequestBody AddressRequest request) {
        return ResponseEntity.ok(addressService.addAddress(request));
    }
}
